package com.garonenaturescovers.app.garonedapater

import android.content.pm.PackageManager
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.io.File
import java.io.FileOutputStream
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Environment
import android.view.LayoutInflater
import com.garonenaturescovers.app.MainActivity
import com.garonenaturescovers.app.databinding.GaroneItemBinding
import com.garonenaturescovers.app.garonedata.GaroneData


import java.io.OutputStream
import java.lang.Exception
import java.util.*

class GaroneAdapter(val bchcsdfsf :List<GaroneData>, val activity: AppCompatActivity) : RecyclerView.Adapter<GaroneAdapter.ProfItemHolder>() {
    class ProfItemHolder(val binding : GaroneItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setProfLaItem(psdsawe : GaroneData, activity : AppCompatActivity) = with(binding){
            Picasso.get().load(psdsawe.odssds).centerCrop().resize(1280,720)
                .into(imMain,object : Callback {
                    override fun onSuccess() {
                        vcvsdasd.visibility = View.INVISIBLE
                    }

                    override fun onError(e: Exception?) {

                    }

                } )

            jsjsdhds.setOnClickListener {
                if(ContextCompat.checkSelfPermission(activity,android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(activity, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),100)
                } else {
                    val externalStoreState = Environment.getExternalStorageState()
                    if(externalStoreState.equals(Environment.MEDIA_MOUNTED)){
                        try{
                            val osiisda = Environment.getExternalStorageDirectory().absolutePath
                            val kslsad = File(osiisda,"${UUID.randomUUID()}.jpg")
                            val jwerwe : OutputStream = FileOutputStream(kslsad)
                            val bxbxhsd  = ContextCompat.getDrawable(activity.applicationContext,psdsawe.odssds)
                            val psjasdd = (bxbxhsd as BitmapDrawable).bitmap
                            psjasdd.compress(Bitmap.CompressFormat.JPEG,100,jwerwe)
                            jwerwe.flush()
                            jwerwe.close()

                            val snackBar = Snackbar.make((activity as MainActivity).findViewById(android.R.id.content),"Image is saving...",Snackbar.LENGTH_LONG)
                            snackBar.show()
                        }catch(e : Exception){
                            Toast.makeText(activity.applicationContext, "Image is saving...",Toast.LENGTH_LONG).show()
                        }


                    }
                }

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfItemHolder {
        val binding = GaroneItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProfItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfItemHolder, position: Int) {
        holder.setProfLaItem(bchcsdfsf[position],activity)

    }

    override fun getItemCount() = bchcsdfsf.size


}