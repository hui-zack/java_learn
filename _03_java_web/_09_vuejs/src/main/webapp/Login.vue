<template>
  <div class="login-page">
    <div class="container">
      <div class="logo-contianer flc">
        <img src="../assets/logo.png" class="logo" alt srcset />
        |
        <span class="logo-title">安全生产智能监控系统</span>
      </div>
      <el-form
        :model="loginForm"
        :rules="loginRules"
        ref="loginForm"
        class="login-form"
      >
        <el-form-item prop="name">
          <el-input
            prefix-icon="el-icon-my-name"
            v-model="loginForm.name"
            autocomplete="on"
            placeholder="请输入用户名"
          ></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input
            type="password"
            prefix-icon="el-icon-my-password"
            v-model="loginForm.password"
            autocomplete="on"
            placeholder="请输入密码"
          ></el-input>
        </el-form-item>
        <div
          @click="checked = !checked"
          class="check-box fll"
          :class="checked ? 'check-seleck' : 'check-unseleck'"
        >
          记住密码
        </div>
        <el-form-item class="btn-submit">
          <el-button
            type="primary"
            :loading="loading"
            @click="handleLogin('loginForm')"
            >立即登录</el-button
          >
        </el-form-item>
      </el-form>
    </div>
    <footer class="footer flc">
      Copyright @ 2019 超意图信息科技有限公司 川ICP备 12345678号
    </footer>
  </div>
</template>
<script>
export default {
  data() {
    var validateName = (rule, value, callback) => {
      if (!value || value.length < 1) {
        callback(new Error("用户名不能为空"));
      } else {
        callback();
      }
    };
    var validatePassword = (rule, value, callback) => {
      if (!value || value.length < 1) {
        callback(new Error("密码不能为空"));
      } else {
        callback();
      }
    };
    return {
      checked: false,
      loading: false,
      loginForm: {
        name: "",
        password: ""
      },
      loginRules: {
        name: [{ validator: validateName, trigger: "blur" }],
        password: [{ validator: validatePassword, trigger: "blur" }]
      }
    };
  },
  methods: {
    handleLogin() {
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          this.loading = true;
          this.$router.push({ path: "/" });
          // this.$store
          //   .dispatch("LoginByUsername", this.loginForm)
          //   .then(res => {
          //     console.log(res);
          //     this.loading = false;
          //     if (res.type === this.$successCode) {
          //       this.$router.push({ path: "/" });
          //       //location.reload()
          //     } else {
          //       this.refreshCaptcha();
          //     }
          //   })
          //   .catch(() => {
          //     this.loading = false;
          //     this.refreshCaptcha();
          //   });
        } else {
          return false;
        }
      });
    }
  }
};
</script>

<style lang="scss">
.login-page {
  .login-form {
    .el-form-item.is-error .el-input__inner,
    .el-form-item.is-error .el-input__inner:focus,
    .el-form-item.is-error .el-textarea__inner,
    .el-form-item.is-error .el-textarea__inner:focus,
    .el-message-box__input input.invalid,
    .el-message-box__input input.invalid:focus {
      border-color: #f56c6c;
    }
    .el-input--prefix .el-input__inner {
      padding-left: 50px;
      border-color: #808080;
      color: #ffffff;
      height: 48px;
      &:focus {
        border-color: #0085ee;
      }
    }
    .el-icon-my-name {
      margin-left: 7px;
      background: url("~@/assets/login-name.png") center center/24px no-repeat;
    }
    .el-icon-my-password {
      margin-left: 7px;
      background: url("~@/assets/login-password.png") center center/24px
        no-repeat;
    }

    .btn-submit {
      margin-top: 40px;
      .el-form-item__content {
        display: flex;
        align-items: center;
        justify-content: center;
        .el-button {
          width: 262px;
          height: 48px;
          background: #0085ee;
          box-shadow: 0px 8px 19px -6px rgba(0, 133, 238, 0.64);
          border-radius: 24px;
          font-size: 14px;
          color: #fff;
        }
      }
    }
  }
}
</style>

<style rel="stylesheet/scss" lang="scss" scoped>
.login-page {
  position: fixed;
  height: 100%;
  width: 100%;
  background: url("~@/assets/login-background.png") center center/cover
    no-repeat;
  .container {
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    width: 342px;
    height: 302px;
    .logo-contianer {
      font-size: 16px;
      font-weight: 500;
      color: rgba(255, 255, 255, 1);
      margin-bottom: 44px;
      .logo {
        width: 98px;
        height: 20px;
        margin-right: 12px;
      }
      .logo-title {
        margin-left: 12px;
      }
    }
    .login-form {
      .check-box {
        width: fit-content;
        height: 24px;
        cursor: pointer;
        font-size: 14px;
        font-weight: 400;
        color: rgba(255, 255, 255, 1);
        padding-left: 32px;
        user-select: none;
        &.check-unseleck {
          background: url("~@/assets/check-box-unselect.png") left center/24px
            no-repeat;
        }
        &.check-seleck {
          background: url("~@/assets/check-box-select.png") left center/24px
            no-repeat;
        }
      }
    }
  }
  .footer {
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    height: 64px;
    color: #ffffff;
  }
}
</style>
