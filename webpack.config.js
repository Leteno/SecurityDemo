const path = require('path');

module.exports = {
  entry: "./app/worker.ts",
  
  output: {
    path:path.resolve(__dirname, "dist"),
    filename: "[name].js",
  },
  devServer: {
    proxy: {
      '/api': 'http://localhost:3000'
    },
    static: path.join(__dirname, 'public'),
    compress: true,
    historyApiFallback: true,
    hot: true,
    https: false,
  },
}