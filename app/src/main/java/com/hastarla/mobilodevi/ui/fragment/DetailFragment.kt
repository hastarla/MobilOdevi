package com.hastarla.mobilodevi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.hastarla.mobilodevi.R
import com.hastarla.mobilodevi.data.model.User
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private val args: DetailFragmentArgs by navArgs()
    private lateinit var userItem: User

    private lateinit var avatar: String
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var id: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            userItem = args.userItemDetail
        if (userItem != null) {
            avatar = "data:image/jpeg;base64,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"
            id = userItem.id
            name = userItem.name
            email = userItem.email
        } else {
            avatar = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fgaleri7.uludagsozluk.com%2F245%2Fmarmara-kazim_503013.png&imgrefurl=https%3A%2F%2Fgaleri.uludagsozluk.com%2Fr%2Fmarmara-kaz%25C4%25B1m-503013%2F&tbnid=3fZQsKVtW8Fy6M&vet=10CBMQxiAoAmoXChMImJeBi_fQ8AIVAAAAAB0AAAAAEAY..i&docid=U1fYRuvdl5f2WM&w=633&h=353&itg=1&q=marmara%20kazım&client=opera&ved=0CBMQxiAoAmoXChMImJeBi_fQ8AIVAAAAAB0AAAAAEAY"
            id = "31509292643"
            name = "Mehmet emin Hastarla"
            email = "Mehmet.hastarla@outlook.com.tr"
        }

        Glide.with(requireContext()).load(avatar).into(frDetailImageViewProfilePicture)
        frDetailTextViewId.text = id
        frDetailTextViewName.text = name
        frDetailTextViewEmail.text = email

    }

}