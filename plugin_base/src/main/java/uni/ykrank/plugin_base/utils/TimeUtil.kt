package uni.ykrank.plugin_base.utils

import java.text.SimpleDateFormat
import java.util.*


object TimeUtil {
    val locale = Locale.CHINA
    val ymd = SimpleDateFormat("yyyy-MM-dd", locale)
    val ymdhms = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale)
}