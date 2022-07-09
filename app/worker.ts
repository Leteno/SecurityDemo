import {trustedResourceUrl, unwrapResourceUrl} from 'safevalues'

let workerSrc = trustedResourceUrl`https://www.baidu.com`;
new Worker(unwrapResourceUrl(workerSrc) as string);

