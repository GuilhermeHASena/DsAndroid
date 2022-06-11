package fiap.com.br.ds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import fiap.com.br.ds.databinding.FragmentCadastrarBinding


class CadastrarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentCadastrarBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_cadastrar, container, false)
        binding.btAdd.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_cadastrarFragment_to_listarFragment)
        }
        return binding.root
    }
}