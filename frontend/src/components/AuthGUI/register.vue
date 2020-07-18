<template>
  <div id="base_login">
    <div class="row">
      <div class="col-1"></div>
      <div class="col-5">
        <div
          class="card text-white mb-3"
          style="max-width: 22rem ; background:transparent; border:none"
        >
          <div class="card-body">
            <h5 class="card-title">Daddy提供的服务</h5>
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
            <h2 style="font-size:20px">注册</h2>
            <br />
            <div class="form-group">
              <span for="registerName">用户名称</span>
              <br />
              <input
                type="text"
                class="text-input"
                id="registerName"
                placeholder="enter your name here"
              />
            </div>
            <div class="form-group">
              <span for="registerEmail">邮箱</span>
              <br />
              <input
                type="text"
                class="text-input"
                id="registerEmail"
                placeholder="enter your email here"
              />
            </div>
            <div class="form-group">
              <span for="registerPassword">密码</span>
              <br />
              <input
                type="password"
                class="text-input"
                id="registerPassword"
                placeholder="enter your password here"
              />
            </div>
            <div class="form-group">
              <span for="registerPassword">确认密码</span>
              <br />
              <input
                type="password"
                class="text-input"
                id="registerRePassword"
                placeholder="enter your password here again"
              />
            </div>
            <button type="button" class="btn btn-success" style="width:70%">提交注册表单</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "register"
};
</script>

<style>
</style>