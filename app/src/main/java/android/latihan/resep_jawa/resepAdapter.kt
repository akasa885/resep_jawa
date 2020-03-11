package android.latihan.resep_jawa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class resepAdapter (val resepList: List<ResepData>, val clickListener: (ResepData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepList[position], clickListener)
    }

    override fun getItemCount(): Int = resepList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(resepTampil: ResepData, clickListener: (ResepData) -> Unit){
            val myImage = itemView.findViewById<ImageView>(R.id.img_part)
            myImage.setImageResource(resepTampil.photo)
//            Glide.with(itemView.context).load(resepTampil.photo).into(myImage)
            itemView.part_item_name.text = resepTampil.foodName
            itemView.part_id.text = resepTampil.region
            itemView.setOnClickListener{clickListener(resepTampil)}
        }
    }
}