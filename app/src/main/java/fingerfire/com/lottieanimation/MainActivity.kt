package fingerfire.com.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import fingerfire.com.lottieanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlayAnimation.setOnClickListener {
            val animationView: LottieAnimationView = binding.animationView
            animationView.playAnimation()
        }

        binding.buttonStopAnimation.setOnClickListener {
            val animationView: LottieAnimationView = binding.animationView
            animationView.pauseAnimation()
        }
    }
}