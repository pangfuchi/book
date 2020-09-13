

/**
 * --------------------------------------------------------------------------
 * settour.bus.data.js
 * 時間相關 js code
 * --------------------------------------------------------------------------
 */

// 格式化時間
// 用法
// time1 = new Date().Format("yyyy-MM-dd");
// time2 = new Date().Format("yyyy-MM-dd HH:mm:ss");  
Date.prototype.Format = function(fmt) {
  var o = {
    "M+": this.getMonth() + 1,
    "d+": this.getDate(),
    "h+": this.getHours(),
    "m+": this.getMinutes(),
    "s+": this.getSeconds(),
    "q+": Math.floor((this.getMonth() + 3) / 3),
    "S": this.getMilliseconds()
  };
  if (/(y+)/.test(fmt))
    fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
  for (var k in o)
    if (new RegExp("(" + k + ")").test(fmt))
      fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
  return fmt;
}

// 將指定日期加上天數
// today = new Date();
// tomorrow = today.addDays(1)
Date.prototype.addDays = function(days) {
  this.setDate(this.getDate() + days);
  return this;
}

//設定時間,傳入日期 ,時間 ,回傳含時間的日期
//setTime(new Date(), "12:00") 
function setTime(dateStr, timeStr) {
  tmpDt = new Date(dateStr);
  tmpDt = new Date(tmpDt.Format("yyyy-MM-dd") + " " + timeStr);
  return tmpDt;
}
