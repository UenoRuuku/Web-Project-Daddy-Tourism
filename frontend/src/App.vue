<template>
  <div id="app">
    <!--导航栏-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark animated slideInDown" style="z-index:99">
      <a class="navbar-brand" href="#">Daddy</a>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="#" @click="home()">
              Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <form class="form-inline">
            <input
              class="form-control mr-sm-2"
              type="search"
              placeholder="Search"
              aria-label="Search"
            />
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </ul>
      </div>
      <a @click="auth()" class="navbar-text inverse-a">log in timeout</a>
    </nav>
    <!--导航栏-->
    <!--路由组件-->
    <router-view />
  </div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
import "animate.css/source/animate.css";

export default {
  name: "App",
  methods: {
    home() {
      this.$router.push({ path: "/" });
    },
    auth() {
      this.$router.push({ path: "/auth" });
    }
  }
};
</script>

<style>
body {
  background-color: #343a40 !important;
}
h2 {
  font-family: "Motiva Sans", Sans-serif;
  font-weight: 300;
  font-size: 14px;
  text-transform: uppercase;
  color: #fff;
  margin: 0 0 10px;
  letter-spacing: 2px;
  font-weight: normal;
  padding-top: 2px;
}
.inverse-a:hover {
  cursor: pointer;
  color: white;
}
span {
  color: #d9dadd;
  font-family: "Motiva Sans", Sans-serif;
  font-size: 13px;
}
</style>
