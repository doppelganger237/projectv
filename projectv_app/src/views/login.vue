<template>
  <el-row :gutter="20">
    <el-col :span="6"><div class="grid-content bg-purple" /></el-col>
    <el-col :span="12">
      <el-form :model="param" :rules="rules" label-width="120px">
        <el-form-item label="用户名" prop="username">
          <el-input v-model="param.username" />
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input type="password" v-model="param.password" @keyup.enter="login()" />
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="login()">登录</el-button>
        </el-form-item>
      </el-form>

    </el-col>
    <el-col :span="6"><div class="grid-content bg-purple" /></el-col>
  </el-row>

</template>

<script>

import {  reactive } from "vue";
import {ElMessage} from 'element-plus'
export default {

  setup(){
    const param = reactive({
      username: "admin",
      password: "123123",
    });
    const rules = {
      username: [
        {
          required: true,
          message: "请输入用户名",
          trigger: "blur",
        },
      ],
      password: [
        { required: true, message: "请输入密码", trigger: "blur" },
      ],
    };
    const login = () => {
      //TODO 访问登录接口
      ElMessage.success("登录成功");
    };
    return {param,rules,login}
  }

};
</script>

<style scoped>
</style>