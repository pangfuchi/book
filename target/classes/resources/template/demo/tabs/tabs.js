angular.module('myApp').component('tabs', { 
  templateUrl: '/template/demo/tabs/tabs.html',
  // 從呼叫著傳入相關的參數，相關符號說明：https://settour01.atlassian.net/wiki/spaces/SETBUS/pages/610566224/Angulajs+Bindings
  bindings: {
    tabs: '='
  },
  controller: function tabsController() {
    // 提供給 Tabs.html 裡使用的 function
    this.sendMsg = function(id) {
      this.id = id ;
    }
  }
});