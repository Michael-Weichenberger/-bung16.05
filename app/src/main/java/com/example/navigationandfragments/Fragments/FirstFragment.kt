

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationandfragments.R
import com.example.navigationandfragments.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.anmelden.setOnClickListener {
            findNavController().navigate(R.id.second_Fragment)
        }
        binding.Registrieren.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToThirdFragment("Hello User")
            )
        }
    }
}



