package com.musnadil.challangechapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.bumptech.glide.Glide
import com.musnadil.challangechapter2.databinding.ActivityShopeeBinding

class Shopee : AppCompatActivity() {
    private lateinit var viewBinding :ActivityShopeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityShopeeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val shopeeLokal = "https://cf.shopee.co.id/file/d7385c2d6fb6d57c647a09fad1114e14_xhdpi"
        val shopeeElektronik = "https://cf.shopee.co.id/file/fe02a504f64b146f90af16947ae65d08_xhdpi"
        val shopeePulsa = "https://cf.shopee.co.id/file/5164f9b1e9319def7e609101eb3c9349_xhdpi"
        val shopeeInFashion = "https://cf.shopee.co.id/file/4447bdcba3c51c693feef4f22ba05c49_xhdpi"
        val shopeeSupermarket = "https://cf.shopee.co.id/file/d38815fe0e030e787cf2e0508d3e8c80_xhdpi"
        val shopeeCod = "https://cf.shopee.co.id/file/12c9571aaf93404afaaf9b46ef2bb345_xhdpi"
        val shopeeMurahLebay = "https://cf.shopee.co.id/file/4e08bce7d8d6ab488b82ab59d03cb793_xhdpi"
        val shopeeVoucher = "https://cf.shopee.co.id/file/4497ac7ff3ee9711a8d512d0f8297b49_xhdpi"
        val shopeePromoBank = "https://cf.shopee.co.id/file/e14301aa0ad57dcb82e08564d799f83a_xhdpi"
        val shopeeSemuaPromo = "https://cf.shopee.co.id/file/60434906cac999e73fdcc78c8f484467_xhdpi"
        val imgFlashSale = "https://deo.shopeemobile.com/shopee/shopee-pcmall-live-sg/flashsale/fb1088de81e42c4e538967ec12cb5caa.png"

        val imgFSOne = "https://images.tokopedia.net/img/cache/700/product-1/2019/9/20/73741951/73741951_e0bb6179-1d4d-47cf-bfd9-f8dc728e52fa_1000_1000.webp?ect=4g"
        val imgFSTwo = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/3/31/64e92446-c013-4438-826d-b274025a4570.jpg.webp?ect=4g"
        val imgFSThree = "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2021/1/14/a70cb24b-48bb-4820-97c3-49f9694bbe4a.jpg.webp?ect=4g"
        val imgFSFour = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/6/21/645d7840-fdfe-49c0-9d71-959a5a218251.jpg.webp?ect=4g"
        Glide.with(this)
            .load(shopeeLokal)
            .fitCenter()
            .into(viewBinding.shopeeLokal)

        Glide.with(this)
            .load(shopeeElektronik)
            .fitCenter()
            .into(viewBinding.elektronik)

        Glide.with(this)
            .load(shopeePulsa)
            .fitCenter()
            .into(viewBinding.pulsa)

        Glide.with(this)
            .load(shopeeInFashion)
            .fitCenter()
            .into(viewBinding.infashion)

        Glide.with(this)
            .load(shopeeSupermarket)
            .fitCenter()
            .into(viewBinding.supermarket)

        Glide.with(this)
            .load(shopeeCod)
            .fitCenter()
            .into(viewBinding.shopeeCod)

        Glide.with(this)
            .load(shopeeMurahLebay)
            .fitCenter()
            .into(viewBinding.shopeeMurahLebay)

        Glide.with(this)
            .load(shopeeVoucher)
            .fitCenter()
            .into(viewBinding.gratisOngkir)

        Glide.with(this)
            .load(shopeePromoBank)
            .fitCenter()
            .into(viewBinding.promoBank)

        Glide.with(this)
            .load(shopeeSemuaPromo)
            .fitCenter()
            .into(viewBinding.semuaPromo)

        Glide.with(this)
            .load(imgFlashSale)
            .fitCenter()
            .into(viewBinding.imgFlashsale)

        Glide.with(this)
            .load(imgFSOne)
            .fitCenter()
            .into(viewBinding.imgFs1)

        Glide.with(this)
            .load(imgFSTwo)
            .fitCenter()
            .into(viewBinding.imgFs2)

        Glide.with(this)
            .load(imgFSThree)
            .fitCenter()
            .into(viewBinding.imgFs3)

        Glide.with(this)
            .load(imgFSFour)
            .fitCenter()
            .into(viewBinding.imgFs4)
    }
}