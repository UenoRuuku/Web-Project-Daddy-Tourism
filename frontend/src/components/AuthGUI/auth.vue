<template>
  <div id="base-auth">
    <div id="goToRegister" class="link animated slideInUp">
      <div class="m-auto arrow_down">
        <div class="chevron"></div>
        <div class="chevron"></div>
        <div class="chevron"></div>
      </div>
      <br />
      <br />
      <a href="#" @click="switchToRegister()">
        <span style="font-size:14px">还没有账户？点击注册</span>
      </a>
    </div>
    <div id="goToLogin" class="d-see link">
      <div class="m-auto arrow_down">
        <div class="chevron"></div>
        <div class="chevron"></div>
        <div class="chevron"></div>
      </div>
      <br />
      <br />
      <a href="#" @click="switchToLogin()">
        <span style="font-size:14px">还没有账户？点击注册</span>
      </a>
    </div>
    <div class="container">
      <login id="login" class="animated slideInDown" />
      <register id="register" class="d-see" />
    </div>
  </div>
</template>

<script>
import login from "./login";
import register from "./register";

export default {
  name: "Auth",
  components: {
    login: login,
    register: register
  },
  data() {
    return {
      timer1: ""
    };
  },
  methods: {
    switchToRegister() {
      var aim = document.getElementById("login");
      var target = document.getElementById("register");
      var link = document.getElementById("goToRegister");
      var link2 = document.getElementById("goToLogin");
      aim.className = "animated slideOutUp";
      link.className = "animated slideOutDown link";
      clearTimeout(this.timer1);
      this.timer1 = setTimeout(() => {
        aim.className = "d-see";
        target.className = "animated slideInDown";
        link2.className = "animated slideInUp link";
      }, 1000);
    },
    switchToLogin() {
      var aim = document.getElementById("login");
      var target = document.getElementById("register");
      var link = document.getElementById("goToRegister");
      var link2 = document.getElementById("goToLogin");
      target.className = "animated slideOutUp";
      link2.className = "animated slideOutDown link";
      clearTimeout(this.timer1);
      this.timer1 = setTimeout(() => {
        target.className = "d-see";
        aim.className = "animated slideInDown";
        link.className = "animated slideInUp link";
      }, 1000);
    }
  }
};
</script>

<style>
/* 滑动箭头的动画 */
.chevron {
  position: absolute;
  width: 28px;
  height: 8px;
  opacity: 0;
  transform: scale3d(0.5, 0.5, 0.5);
  animation: move 3s ease-out infinite;
}
.chevron:first-child {
  animation: move 3s ease-out 1s infinite;
}
.chevron:nth-child(2) {
  animation: move 3s ease-out 2s infinite;
}
.chevron:before,
.chevron:after {
  content: " ";
  position: absolute;
  top: 0;
  height: 100%;
  width: 51%;
  background: #fff;
}
.chevron:before {
  left: 0;
  transform: skew(0deg, 30deg);
}
.chevron:after {
  right: 0;
  width: 50%;
  transform: skew(0deg, -30deg);
}
@keyframes move {
  25% {
    opacity: 1;
  }
  33% {
    opacity: 1;
    transform: translateY(30px);
  }
  67% {
    opacity: 1;
    transform: translateY(40px);
  }
  100% {
    opacity: 0;
    transform: translateY(55px) scale3d(0.5, 0.5, 0.5);
  }
}

.text-input {
  background-color: rgba(0, 0, 0, 0.2);
  color: #fff;
  border: 1px solid #000;
  border-radius: 3px;
  box-shadow: 1px 1px 0px #45556c;
  padding: 5px;
  margin: 4px 0;
  width: 70%;
}

.form-container {
  padding-left: 40px;
  padding-bottom: 40px;
  padding-top: 30px;
  background: transparent;
}

.link {
  position: fixed;
  bottom: 10px;
  width: 100%;
  text-align: center;
}

.arrow_down {
  display: block;
  margin: 0 auto;
  position: relative;
  width: 24px;
  height: 24px;
}
</style>