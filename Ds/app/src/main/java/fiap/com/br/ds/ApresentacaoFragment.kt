package fiap.com.br.ds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import fiap.com.br.ds.databinding.FragmentApresentacaoBinding

class ApresentacaoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentApresentacaoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_apresentacao, container, false)
        binding.btSaibaMais.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_apresentacaoFragment_to_saibaMaisFragment)
        }
        return binding.root
    }
}