# v13
Splash Screen and Intents
Completed the whole concept till v12
Showcasing some more functinality of intents 

<details><summary>Code</summary>
<p>

### within same app --> Explicit Intent
```kotlin
 intent = Intent(this,Order::class.java).apply {
                putExtra(KEY,orderPlaced)
            }
            startActivity(intent)
```
#### here KEY is companion object
```.kt
 companion object{
        const val KEY = "com.example.v13.MainActivity.KEY"
    }
```
#### code for receiving Data on other class
```.kt
 val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
```
</p>
</details>



<details><summary>And for Splash Screen</summary>
<p>

[Video Link 1](https://youtu.be/Q0gRqbtFLcw)

[Video Link 2](https://youtu.be/Loo4i5IrZ4Y)

add this to build.gradle file (app)
```.gradle
 implementation 'androidx.core:core-splashscreen:1.0.0'
```
create a logo having 240X240 and item in 160X160
then see this [documentation](https://developer.android.com/develop/ui/views/launch/splash-screen/migrate) 

1. creating splash.xml in value folder for both day and night having style parent ```parent="Theme.SplashScreen" ```
   and item given above
   
2. change theme in android manifest from your theme to the theme you created in ```splash.xml```

3. add this ```installSplashScreen()```in your onCreateMethod
</p>
</details>

<details><summary>View Binding</summary>
 <p>
  
  [Official Documentation](https://developer.android.com/topic/libraries/view-binding)
  
  <details><summary>Code 1</summary>
   <p>
    
```.kt
       val binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
```
   </p>
   </details>
  
  <details><summary>Code 2</summary>
   <p>
    
```.kt
    //inside of class
    private lateinit var binding: ActivityMainBinding
    
    //inside function
     binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
```
   </p>
   </details>
 </p>  
</details>


## Project Demo Video

<img src="https://user-images.githubusercontent.com/52217208/219461759-ee9d6106-a826-4613-9956-fa99f58e70d7.webm" width=25% height=25%>
