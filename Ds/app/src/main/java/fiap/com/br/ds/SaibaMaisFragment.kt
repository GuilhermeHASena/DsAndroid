package fiap.com.br.ds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import fiap.com.br.ds.databinding.FragmentSaibaMaisBinding

class SaibaMaisFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentSaibaMaisBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_saiba_mais,container,false)
        binding.btAgendar.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_saibaMaisFragment_to_listarFragment)
        }
        return binding.root
    }

}