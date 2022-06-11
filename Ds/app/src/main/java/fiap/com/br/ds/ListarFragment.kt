package fiap.com.br.ds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import fiap.com.br.ds.databinding.FragmentListarBinding

class ListarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentListarBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_listar, container, false)
        binding.fabViagemAdd.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_listarFragment_to_cadastrarFragment)
        }
        return binding.root
    }
}