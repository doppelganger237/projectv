const { defineConfig } = require('@vue/cli-service')

const port = process.env.port || process.env.npm_config_port || 80 // 端口
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: process.env.NODE_ENV === 'development',
  productionSourceMap: false,
  devServer: {
    port: port,
    open: true,

    proxy: {
      '/api': {
        target: `http://localhost:8080/`,
        ws: true
      }
    }
  },

})
