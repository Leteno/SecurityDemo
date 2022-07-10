import {trustedResourceUrl, unwrapResourceUrl} from 'safevalues'
import {create} from 'safevalues/dom/globals/worker';

let workerSrc = trustedResourceUrl`https://www.baidu.com`;
let worker: Worker = create(workerSrc);

