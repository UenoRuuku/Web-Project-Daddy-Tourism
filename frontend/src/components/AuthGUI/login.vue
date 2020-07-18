<template>
  <div id="base_login">
    <br />
    <div class="row">
      <div class="col-1"></div>
      <div class="col-5">
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
      <div class="col-6">
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
              <span for="password">密码</span>
              <br />
              <input
                type="password"
                class="text-input"
                id="password"
                placeholder="enter your password here"
              />
            </div>
            <br />
            <button type="button" class="btn btn-success" style="width:70%">Login</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "login"
};
</script>

<style>
.btn-login {
  background: #799905;
  background: -webkit-linear-gradient(top, #799905 5%, #536904 95%);
  background: linear-gradient(to bottom, #799905 5%, #536904 95%);
}
</style>