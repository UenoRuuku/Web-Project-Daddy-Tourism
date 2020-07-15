<template>
  <div id="base-home">
    <div class="animated fadeIn container">
      <div class="row">
        <div class="col-4">
          <br />
          <h2>最新上传</h2>
          <br />
          <div class="container">
            <div class="card mb-3 img-container">
              <img src="../../assets/timg.jpg" class="card-img-top" alt="..." />
              <div class="card-body">
                <h5 class="card-title">凛冽谷的伊璐夕儿</h5>
                <p class="card-text">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-1"></div>
        <div class="col-7">
          <br />
          <br />
          <div id="home-nav" class="container">
            <div class="row">
              <div class="col-2 home-tab">
                <span>你的收藏</span>
              </div>
              <div class="col-2 home-tab">
                <span>最热门</span>
              </div>
              <div class="col-2 home-tab">
                <span>最新上传</span>
              </div>
              <div class="col-4 home-tab-disabled"></div>
              <div id="logout-button" class="col-2 home-tab-disabled"></div>
            </div>
          </div>
          <br />
          <br />
          <h2>精选和推荐</h2>
          <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
              <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="../../assets/timg.jpg" class="d-block w-100" alt="..." />
                <div class="carousel-caption d-none d-md-block">
                  <h5>First slide label</h5>
                  <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                </div>
              </div>
              <div class="carousel-item">
                <img src="../../assets/timg.jpg" class="d-block w-100" alt="..." />
                <div class="carousel-caption d-none d-md-block">
                  <h5>Second slide label</h5>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                </div>
              </div>
              <div class="carousel-item">
                <img src="../../assets/timg.jpg" class="d-block w-100" alt="..." />
                <div class="carousel-caption d-none d-md-block">
                  <h5>Third slide label</h5>
                  <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                </div>
              </div>
            </div>
            <a
              class="carousel-control-prev"
              href="#carouselExampleCaptions"
              role="button"
              data-slide="prev"
            >
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a
              class="carousel-control-next"
              href="#carouselExampleCaptions"
              role="button"
              data-slide="next"
            >
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
import "animate.css/source/animate.css";
export default {
  name: "Home"
};
</script>

<style scoped>
.inverse-a:hover {
  cursor: pointer;
  color: white;
}
#home-nav {
  height: 35px;
  margin: 0;
  padding: 0;
}
.home-tab {
  border-right: 1px solid rgba(16, 21, 25, 0.3);
  color: #d9dadd;
  background: rgba(62, 126, 167, 0.8);
  text-align: center;
}
.home-tab-disabled {
  border-right: 1px solid rgba(16, 21, 25, 0.3);
  color: #d9dadd;
  background: rgba(62, 126, 167, 0.8);
}
.home-tab:hover {
  color: black;
  background: linear-gradient(to bottom, #e3eaef 5%, #c7d5e0 95%);
  cursor: pointer;
  transition: 0.8s;
}

.home-tab span {
  color: inherit;
  font-size: 13px;
  line-height: 34px;
  text-shadow: -1px -1px 0px rgba(0, 0, 0, 0.25);
  font-family: "Motiva Sans", Sans-serif;
  font-weight: 300;
}

.img-container:hover {
  transform: translateX(20px);
  transition: 0.5s;
  cursor: pointer;
}
.img-title span {
  font-family: "Motiva Sans", Sans-serif;
  font-weight: 300;
  font-size: 14px;
  text-transform: uppercase;
  color: #fff;
}
</style>