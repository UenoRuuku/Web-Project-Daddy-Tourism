<template>
  <div id="base-auth">
    <div id="goToRegister">
      <div class="m-auto" id="arrow_down">
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
    <div class="container">
      <br />
      <div class="row" id="login">
        <div class="col-1"></div>
        <div class="col-5 animated slideInLeft">
          <div
            class="card text-white mb-3"
            style="max-width: 22rem ; background:transparent; border:none"
          >
            <div class="card-body">
              <h5 class="card-title">为什么加入Daddy</h5>
              <span class="card-text">
                In the Age of Ancients,
                <br />The world was unformed,shrouded by fog.
                <br />A land of grey crags,archtrees,and everlasting dragons
                <br />But then there was Fire.
                <br />And with Fire came Disparity.
              </span>
              <br />
              <br />
              <img src="../../assets/login.jpg" class="d-block w-100" alt="..." />
            </div>
          </div>
        </div>
        <div class="col-6 animated slideInRight">
          <div class="form-container">
            <form>
              <h2 style="font-size:20px">登录</h2>
              <br />
              <div class="form-group">
                <span for="username">用户名称</span>
                <br />
                <input
                  type="text"
                  class="text-input"
                  id="username"
                  placeholder="enter your name here"
                />
              </div>
              <div class="form-group">
                <span for="username">密码</span>
                <br />
                <input
                  type="text"
                  class="text-input"
                  id="username"
                  placeholder="enter your name here"
                />
              </div>
            </form>
          </div>
        </div>
      </div>
      <div class="row" id="register"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Auth",
  data(){
      return{
          timer1:""
      }
  },
  methods:{
      switchToRegister(){
          console.log("?????");
          var aim = document.getElementById("login");
          var target = document.getElementById("register");
          var link = document.getElementById("goToRegister");
          aim.className="row animated slideOutUp"
          link.className="animated slideOutDown"
          this.timer1 = setTimeout(
              ()=>{
                  target.className="row animated slideInUp";
              },1000
          )

      },
      switchToLogin(){

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

#goToRegister {
  position: fixed;
  bottom: 10px;
  width: 100%;
  text-align: center;
}

#arrow_down {
  display: block;
  margin: 0 auto;
  position: relative;
  width: 24px;
  height: 24px;
}
</style>