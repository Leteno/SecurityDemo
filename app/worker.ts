import {trustedTypes} from 'trusted-types'

console.log("hello world");

const workerPolicy = trustedTypes.createPolicy('my-worker-policy', {
  createScriptURL: url => {
    if (url.startsWith(globalThis.origin + '/')) {
      return url;
    }
    if (url == "https://www.baidu.com") {
      return url;
    }

    throw Error(`[my-worker-policy][createScriptURL] URL is not trusted, it is: ${url}`)
  }
});
let workerSrc = workerPolicy.createScriptURL("https://www.baidu.com");
new Worker(workerSrc);
