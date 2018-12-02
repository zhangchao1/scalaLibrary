package dateTime

import java.util.{Calendar,Date}
import java.text.SimpleDateFormat

class DateTimeOperate {

  def getNowDate(format: String): String = {
    val cal = Calendar.getInstance
    val today = new SimpleDateFormat(format).format(cal.getTime())
    today
  }

  def getTodayRangeDay(dayTime: String, format: String, rangeLen: Int): String = {
    val c = Calendar.getInstance()
    val date = new SimpleDateFormat(format).parse(dayTime)
    c.setTime(date)
    val day = c.get(Calendar.DATE)
    c.add(Calendar.DATE, rangeLen)
    val dayRnange = new SimpleDateFormat(format).format(c.getTime())
    dayRnange
  }

  def strToUnix(dayTime: String,format:String): Long ={
    val date = new SimpleDateFormat(format)
    val unitTime = date.parse(dayTime).getTime()
    unitTime
  }

  def unixToStr(unixTime:Long,format:String): String ={
    val date = new Date()
    date.setTime(unixTime)
    val sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    val dayTime = sf.format(date)
    dayTime
  }

  def compareTime(originTime:String,compareTime:String,format:String):Int={
    val cf = new SimpleDateFormat(format)
    val originInt = cf.parse(originTime).getTime()
    val compareInt = cf.parse(compareTime).getTime()
    if (originInt== compareInt){
      return 0
    }else{
      if (originInt>compareInt){
        return 1
      }else{
        return -1
      }
    }
  }

  def getWeek(): Int ={
    val cal = Calendar.getInstance
    val week = cal.get(Calendar.DAY_OF_WEEK)
    week
  }
}

