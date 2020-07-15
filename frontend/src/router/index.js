import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/main/home'
import Auth from '@/components/AuthGUI/auth'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path:"/auth",
      name:"auth",
      component: Auth
    }
  ]
})
