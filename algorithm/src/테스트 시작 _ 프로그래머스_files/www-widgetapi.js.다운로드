(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var p;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}
var ba="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};
function ca(a){a=["object"==typeof globalThis&&globalThis,a,"object"==typeof window&&window,"object"==typeof self&&self,"object"==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error("Cannot find global object");}
var da=ca(this);function t(a,b){if(b)a:{for(var c=da,d=a.split("."),e=0;e<d.length-1;e++){var f=d[e];if(!(f in c))break a;c=c[f]}d=d[d.length-1];e=c[d];f=b(e);f!=e&&null!=f&&ba(c,d,{configurable:!0,writable:!0,value:f})}}
t("Symbol",function(a){function b(e){if(this instanceof b)throw new TypeError("Symbol is not a constructor");return new c("jscomp_symbol_"+(e||"")+"_"+d++,e)}
function c(e,f){this.f=e;ba(this,"description",{configurable:!0,writable:!0,value:f})}
if(a)return a;c.prototype.toString=function(){return this.f};
var d=0;return b});
t("Symbol.iterator",function(a){if(a)return a;a=Symbol("Symbol.iterator");for(var b="Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array".split(" "),c=0;c<b.length;c++){var d=da[b[c]];"function"===typeof d&&"function"!=typeof d.prototype[a]&&ba(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ea(aa(this))}})}return a});
function ea(a){a={next:a};a[Symbol.iterator]=function(){return this};
return a}
function u(a){var b="undefined"!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];return b?b.call(a):{next:aa(a)}}
function ia(a){for(var b,c=[];!(b=a.next()).done;)c.push(b.value);return c}
var ja="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},ka;
if("function"==typeof Object.setPrototypeOf)ka=Object.setPrototypeOf;else{var la;a:{var na={a:!0},oa={};try{oa.__proto__=na;la=oa.a;break a}catch(a){}la=!1}ka=la?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}var pa=ka;
function x(a,b){a.prototype=ja(b.prototype);a.prototype.constructor=a;if(pa)pa(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.F=b.prototype}
function qa(){this.m=!1;this.i=null;this.g=void 0;this.f=1;this.j=this.l=0;this.v=this.h=null}
function ta(a){if(a.m)throw new TypeError("Generator is already running");a.m=!0}
qa.prototype.s=function(a){this.g=a};
function ua(a,b){a.h={ia:b,U:!0};a.f=a.l||a.j}
qa.prototype["return"]=function(a){this.h={"return":a};this.f=this.j};
function y(a,b,c){a.f=c;return{value:b}}
qa.prototype.B=function(a){this.f=a};
function va(a){a.l=2;a.j=3}
function wa(a){a.l=0;a.h=null}
function xa(a){a.v=[a.h];a.l=0;a.j=0}
function ya(a){var b=a.v.splice(0)[0];(b=a.h=a.h||b)?b.U?a.f=a.l||a.j:void 0!=b.B&&a.j<b.B?(a.f=b.B,a.h=null):a.f=a.j:a.f=4}
function za(a){this.f=new qa;this.g=a}
function Ea(a,b){ta(a.f);var c=a.f.i;if(c)return Fa(a,"return"in c?c["return"]:function(d){return{value:d,done:!0}},b,a.f["return"]);
a.f["return"](b);return Ga(a)}
function Fa(a,b,c,d){try{var e=b.call(a.f.i,c);if(!(e instanceof Object))throw new TypeError("Iterator result "+e+" is not an object");if(!e.done)return a.f.m=!1,e;var f=e.value}catch(g){return a.f.i=null,ua(a.f,g),Ga(a)}a.f.i=null;d.call(a.f,f);return Ga(a)}
function Ga(a){for(;a.f.f;)try{var b=a.g(a.f);if(b)return a.f.m=!1,{value:b.value,done:!1}}catch(c){a.f.g=void 0,ua(a.f,c)}a.f.m=!1;if(a.f.h){b=a.f.h;a.f.h=null;if(b.U)throw b.ia;return{value:b["return"],done:!0}}return{value:void 0,done:!0}}
function Ha(a){this.next=function(b){ta(a.f);a.f.i?b=Fa(a,a.f.i.next,b,a.f.s):(a.f.s(b),b=Ga(a));return b};
this["throw"]=function(b){ta(a.f);a.f.i?b=Fa(a,a.f.i["throw"],b,a.f.s):(ua(a.f,b),b=Ga(a));return b};
this["return"]=function(b){return Ea(a,b)};
this[Symbol.iterator]=function(){return this}}
function z(a,b){var c=new Ha(new za(b));pa&&a.prototype&&pa(c,a.prototype);return c}
t("Reflect.setPrototypeOf",function(a){return a?a:pa?function(b,c){try{return pa(b,c),!0}catch(d){return!1}}:null});
t("Object.setPrototypeOf",function(a){return a||pa});
function A(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
var Ka="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)A(d,e)&&(a[e]=d[e])}return a};
t("Object.assign",function(a){return a||Ka});
t("Promise",function(a){function b(g){this.f=0;this.h=void 0;this.g=[];this.m=!1;var h=this.i();try{g(h.resolve,h.reject)}catch(k){h.reject(k)}}
function c(){this.f=null}
function d(g){return g instanceof b?g:new b(function(h){h(g)})}
if(a)return a;c.prototype.g=function(g){if(null==this.f){this.f=[];var h=this;this.h(function(){h.j()})}this.f.push(g)};
var e=da.setTimeout;c.prototype.h=function(g){e(g,0)};
c.prototype.j=function(){for(;this.f&&this.f.length;){var g=this.f;this.f=[];for(var h=0;h<g.length;++h){var k=g[h];g[h]=null;try{k()}catch(l){this.i(l)}}}this.f=null};
c.prototype.i=function(g){this.h(function(){throw g;})};
b.prototype.i=function(){function g(l){return function(m){k||(k=!0,l.call(h,m))}}
var h=this,k=!1;return{resolve:g(this.da),reject:g(this.j)}};
b.prototype.da=function(g){if(g===this)this.j(new TypeError("A Promise cannot resolve to itself"));else if(g instanceof b)this.fa(g);else{a:switch(typeof g){case "object":var h=null!=g;break a;case "function":h=!0;break a;default:h=!1}h?this.sa(g):this.l(g)}};
b.prototype.sa=function(g){var h=void 0;try{h=g.then}catch(k){this.j(k);return}"function"==typeof h?this.ga(h,g):this.l(g)};
b.prototype.j=function(g){this.s(2,g)};
b.prototype.l=function(g){this.s(1,g)};
b.prototype.s=function(g,h){if(0!=this.f)throw Error("Cannot settle("+g+", "+h+"): Promise already settled in state"+this.f);this.f=g;this.h=h;2===this.f&&this.ea();this.v()};
b.prototype.ea=function(){var g=this;e(function(){if(g.G()){var h=da.console;"undefined"!==typeof h&&h.error(g.h)}},1)};
b.prototype.G=function(){if(this.m)return!1;var g=da.CustomEvent,h=da.Event,k=da.dispatchEvent;if("undefined"===typeof k)return!0;"function"===typeof g?g=new g("unhandledrejection",{cancelable:!0}):"function"===typeof h?g=new h("unhandledrejection",{cancelable:!0}):(g=da.document.createEvent("CustomEvent"),g.initCustomEvent("unhandledrejection",!1,!0,g));g.promise=this;g.reason=this.h;return k(g)};
b.prototype.v=function(){if(null!=this.g){for(var g=0;g<this.g.length;++g)f.g(this.g[g]);this.g=null}};
var f=new c;b.prototype.fa=function(g){var h=this.i();g.H(h.resolve,h.reject)};
b.prototype.ga=function(g,h){var k=this.i();try{g.call(h,k.resolve,k.reject)}catch(l){k.reject(l)}};
b.prototype.then=function(g,h){function k(r,q){return"function"==typeof r?function(v){try{l(r(v))}catch(w){m(w)}}:q}
var l,m,n=new b(function(r,q){l=r;m=q});
this.H(k(g,l),k(h,m));return n};
b.prototype["catch"]=function(g){return this.then(void 0,g)};
b.prototype.H=function(g,h){function k(){switch(l.f){case 1:g(l.h);break;case 2:h(l.h);break;default:throw Error("Unexpected state: "+l.f);}}
var l=this;null==this.g?f.g(k):this.g.push(k);this.m=!0};
b.resolve=d;b.reject=function(g){return new b(function(h,k){k(g)})};
b.race=function(g){return new b(function(h,k){for(var l=u(g),m=l.next();!m.done;m=l.next())d(m.value).H(h,k)})};
b.all=function(g){var h=u(g),k=h.next();return k.done?d([]):new b(function(l,m){function n(v){return function(w){r[v]=w;q--;0==q&&l(r)}}
var r=[],q=0;do r.push(void 0),q++,d(k.value).H(n(r.length-1),m),k=h.next();while(!k.done)})};
return b});
function La(a,b,c){if(null==a)throw new TypeError("The 'this' value for String.prototype."+c+" must not be null or undefined");if(b instanceof RegExp)throw new TypeError("First argument to String.prototype."+c+" must not be a regular expression");return a+""}
t("String.prototype.endsWith",function(a){return a?a:function(b,c){var d=La(this,b,"endsWith");b+="";void 0===c&&(c=d.length);for(var e=Math.max(0,Math.min(c|0,d.length)),f=b.length;0<f&&0<e;)if(d[--e]!=b[--f])return!1;return 0>=f}});
t("String.prototype.startsWith",function(a){return a?a:function(b,c){var d=La(this,b,"startsWith");b+="";for(var e=d.length,f=b.length,g=Math.max(0,Math.min(c|0,d.length)),h=0;h<f&&g<e;)if(d[g++]!=b[h++])return!1;return h>=f}});
function Ma(a,b){a instanceof String&&(a+="");var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};
e[Symbol.iterator]=function(){return e};
return e}
t("Array.prototype.keys",function(a){return a?a:function(){return Ma(this,function(b){return b})}});
t("Array.prototype.values",function(a){return a?a:function(){return Ma(this,function(b,c){return c})}});
t("Object.is",function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});
t("Array.prototype.includes",function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length,f=c||0;for(0>f&&(f=Math.max(f+e,0));f<e;f++){var g=d[f];if(g===b||Object.is(g,b))return!0}return!1}});
t("String.prototype.includes",function(a){return a?a:function(b,c){return-1!==La(this,b,"includes").indexOf(b,c||0)}});
t("Array.prototype.entries",function(a){return a?a:function(){return Ma(this,function(b,c){return[b,c]})}});
t("WeakMap",function(a){function b(k){this.f=(h+=Math.random()+1).toString();if(k){k=u(k);for(var l;!(l=k.next()).done;)l=l.value,this.set(l[0],l[1])}}
function c(){}
function d(k){var l=typeof k;return"object"===l&&null!==k||"function"===l}
function e(k){if(!A(k,g)){var l=new c;ba(k,g,{value:l})}}
function f(k){var l=Object[k];l&&(Object[k]=function(m){if(m instanceof c)return m;Object.isExtensible(m)&&e(m);return l(m)})}
if(function(){if(!a||!Object.seal)return!1;try{var k=Object.seal({}),l=Object.seal({}),m=new a([[k,2],[l,3]]);if(2!=m.get(k)||3!=m.get(l))return!1;m["delete"](k);m.set(l,4);return!m.has(k)&&4==m.get(l)}catch(n){return!1}}())return a;
var g="$jscomp_hidden_"+Math.random();f("freeze");f("preventExtensions");f("seal");var h=0;b.prototype.set=function(k,l){if(!d(k))throw Error("Invalid WeakMap key");e(k);if(!A(k,g))throw Error("WeakMap key fail: "+k);k[g][this.f]=l;return this};
b.prototype.get=function(k){return d(k)&&A(k,g)?k[g][this.f]:void 0};
b.prototype.has=function(k){return d(k)&&A(k,g)&&A(k[g],this.f)};
b.prototype["delete"]=function(k){return d(k)&&A(k,g)&&A(k[g],this.f)?delete k[g][this.f]:!1};
return b});
t("Map",function(a){function b(){var h={};return h.previous=h.next=h.head=h}
function c(h,k){var l=h.f;return ea(function(){if(l){for(;l.head!=h.f;)l=l.previous;for(;l.next!=l.head;)return l=l.next,{done:!1,value:k(l)};l=null}return{done:!0,value:void 0}})}
function d(h,k){var l=k&&typeof k;"object"==l||"function"==l?f.has(k)?l=f.get(k):(l=""+ ++g,f.set(k,l)):l="p_"+k;var m=h.g[l];if(m&&A(h.g,l))for(var n=0;n<m.length;n++){var r=m[n];if(k!==k&&r.key!==r.key||k===r.key)return{id:l,list:m,index:n,o:r}}return{id:l,list:m,index:-1,o:void 0}}
function e(h){this.g={};this.f=b();this.size=0;if(h){h=u(h);for(var k;!(k=h.next()).done;)k=k.value,this.set(k[0],k[1])}}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var h=Object.seal({x:4}),k=new a(u([[h,"s"]]));if("s"!=k.get(h)||1!=k.size||k.get({x:4})||k.set({x:4},"t")!=k||2!=k.size)return!1;var l=k.entries(),m=l.next();if(m.done||m.value[0]!=h||"s"!=m.value[1])return!1;m=l.next();return m.done||4!=m.value[0].x||"t"!=m.value[1]||!l.next().done?!1:!0}catch(n){return!1}}())return a;
var f=new WeakMap;e.prototype.set=function(h,k){h=0===h?0:h;var l=d(this,h);l.list||(l.list=this.g[l.id]=[]);l.o?l.o.value=k:(l.o={next:this.f,previous:this.f.previous,head:this.f,key:h,value:k},l.list.push(l.o),this.f.previous.next=l.o,this.f.previous=l.o,this.size++);return this};
e.prototype["delete"]=function(h){h=d(this,h);return h.o&&h.list?(h.list.splice(h.index,1),h.list.length||delete this.g[h.id],h.o.previous.next=h.o.next,h.o.next.previous=h.o.previous,h.o.head=null,this.size--,!0):!1};
e.prototype.clear=function(){this.g={};this.f=this.f.previous=b();this.size=0};
e.prototype.has=function(h){return!!d(this,h).o};
e.prototype.get=function(h){return(h=d(this,h).o)&&h.value};
e.prototype.entries=function(){return c(this,function(h){return[h.key,h.value]})};
e.prototype.keys=function(){return c(this,function(h){return h.key})};
e.prototype.values=function(){return c(this,function(h){return h.value})};
e.prototype.forEach=function(h,k){for(var l=this.entries(),m;!(m=l.next()).done;)m=m.value,h.call(k,m[1],m[0],this)};
e.prototype[Symbol.iterator]=e.prototype.entries;var g=0;return e});
t("Object.entries",function(a){return a?a:function(b){var c=[],d;for(d in b)A(b,d)&&c.push([d,b[d]]);return c}});
t("Set",function(a){function b(c){this.f=new Map;if(c){c=u(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.f.size}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(u([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||f.value[1]!=f.value[0]?!1:e.next().done}catch(g){return!1}}())return a;
b.prototype.add=function(c){c=0===c?0:c;this.f.set(c,c);this.size=this.f.size;return this};
b.prototype["delete"]=function(c){c=this.f["delete"](c);this.size=this.f.size;return c};
b.prototype.clear=function(){this.f.clear();this.size=0};
b.prototype.has=function(c){return this.f.has(c)};
b.prototype.entries=function(){return this.f.entries()};
b.prototype.values=function(){return this.f.values()};
b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=b.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.f.forEach(function(f){return c.call(d,f,f,e)})};
return b});
var B=this||self;function C(a,b){for(var c=a.split("."),d=b||B,e=0;e<c.length;e++)if(d=d[c[e]],null==d)return null;return d}
function Na(){}
function Oa(a){var b=typeof a;b="object"!=b?b:a?Array.isArray(a)?"array":b:"null";return"array"==b||"object"==b&&"number"==typeof a.length}
function Pa(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
function Ra(a){return Object.prototype.hasOwnProperty.call(a,Sa)&&a[Sa]||(a[Sa]=++Ta)}
var Sa="closure_uid_"+(1E9*Math.random()>>>0),Ta=0;function Ua(a,b,c){return a.call.apply(a.bind,arguments)}
function Va(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var e=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(e,d);return a.apply(b,e)}}return function(){return a.apply(b,arguments)}}
function Wa(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?Wa=Ua:Wa=Va;return Wa.apply(null,arguments)}
function D(a,b){var c=a.split("."),d=B;c[0]in d||"undefined"==typeof d.execScript||d.execScript("var "+c[0]);for(var e;c.length&&(e=c.shift());)c.length||void 0===b?d[e]&&d[e]!==Object.prototype[e]?d=d[e]:d=d[e]={}:d[e]=b}
function E(a,b){function c(){}
c.prototype=b.prototype;a.F=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.Ga=function(d,e,f){for(var g=Array(arguments.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return b.prototype[e].apply(d,g)}}
function Xa(a){return a}
;function G(a,b){var c=void 0;return new (c||(c=Promise))(function(d,e){function f(k){try{h(b.next(k))}catch(l){e(l)}}
function g(k){try{h(b["throw"](k))}catch(l){e(l)}}
function h(k){k.done?d(k.value):(new c(function(l){l(k.value)})).then(f,g)}
h((b=b.apply(a,void 0)).next())})}
;function Ya(a){if(Error.captureStackTrace)Error.captureStackTrace(this,Ya);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}
E(Ya,Error);Ya.prototype.name="CustomError";var Za=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if("string"===typeof a)return"string"!==typeof b||1!=b.length?-1:a.indexOf(b,0);
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},H=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e="string"===typeof a?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},$a=Array.prototype.reduce?function(a,b,c){return Array.prototype.reduce.call(a,b,c)}:function(a,b,c){var d=c;
H(a,function(e,f){d=b.call(void 0,d,e,f,a)});
return d};
function ab(a,b){a:{var c=a.length;for(var d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?null:"string"===typeof a?a.charAt(c):a[c]}
function bb(a){return Array.prototype.concat.apply([],arguments)}
function hb(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return c}return[]}
function ib(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(Oa(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
;function jb(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}
;function kb(a,b){for(var c in a)b.call(void 0,a[c],c,a)}
function lb(a){var b=mb,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
function nb(a,b){for(var c in a)if(!(c in b)||a[c]!==b[c])return!1;for(var d in b)if(!(d in a))return!1;return!0}
function ob(a){if(!a||"object"!==typeof a)return a;if("function"===typeof a.clone)return a.clone();var b=Array.isArray(a)?[]:"function"!==typeof ArrayBuffer||"function"!==typeof ArrayBuffer.isView||!ArrayBuffer.isView(a)||a instanceof DataView?{}:new a.constructor(a.length),c;for(c in a)b[c]=ob(a[c]);return b}
var pb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function qb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<pb.length;f++)c=pb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;var rb;var sb=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]},tb=/&/g,ub=/</g,vb=/>/g,wb=/"/g,xb=/'/g,yb=/\x00/g,zb=/[\x00&<>"']/;var I;a:{var Ab=B.navigator;if(Ab){var Bb=Ab.userAgent;if(Bb){I=Bb;break a}}I=""}function J(a){return-1!=I.indexOf(a)}
;function Cb(){}
;var Db=J("Opera"),Eb=J("Trident")||J("MSIE"),Fb=J("Edge"),Gb=J("Gecko")&&!(-1!=I.toLowerCase().indexOf("webkit")&&!J("Edge"))&&!(J("Trident")||J("MSIE"))&&!J("Edge"),Hb=-1!=I.toLowerCase().indexOf("webkit")&&!J("Edge");function Ib(){var a=B.document;return a?a.documentMode:void 0}
var Jb;a:{var Kb="",Lb=function(){var a=I;if(Gb)return/rv:([^\);]+)(\)|;)/.exec(a);if(Fb)return/Edge\/([\d\.]+)/.exec(a);if(Eb)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(Hb)return/WebKit\/(\S+)/.exec(a);if(Db)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
Lb&&(Kb=Lb?Lb[1]:"");if(Eb){var Ub=Ib();if(null!=Ub&&Ub>parseFloat(Kb)){Jb=String(Ub);break a}}Jb=Kb}var Vb=Jb,Wb;if(B.document&&Eb){var Xb=Ib();Wb=Xb?Xb:parseInt(Vb,10)||void 0}else Wb=void 0;var Yb=Wb;var Zb=J("iPhone")&&!J("iPod")&&!J("iPad")||J("iPod"),$b=J("iPad");var ac={},bc=null;var K=window;function cc(a){var b=C("window.location.href");null==a&&(a='Unknown Error of type "null/undefined"');if("string"===typeof a)return{message:a,name:"Unknown error",lineNumber:"Not available",fileName:b,stack:"Not available"};var c=!1;try{var d=a.lineNumber||a.line||"Not available"}catch(g){d="Not available",c=!0}try{var e=a.fileName||a.filename||a.sourceURL||B.$googDebugFname||b}catch(g){e="Not available",c=!0}b=dc(a);if(!(!c&&a.lineNumber&&a.fileName&&a.stack&&a.message&&a.name)){c=a.message;if(null==
c){if(a.constructor&&a.constructor instanceof Function){if(a.constructor.name)c=a.constructor.name;else if(c=a.constructor,ec[c])c=ec[c];else{c=String(c);if(!ec[c]){var f=/function\s+([^\(]+)/m.exec(c);ec[c]=f?f[1]:"[Anonymous]"}c=ec[c]}c='Unknown Error of type "'+c+'"'}else c="Unknown Error of unknown type";"function"===typeof a.toString&&Object.prototype.toString!==a.toString&&(c+=": "+a.toString())}return{message:c,name:a.name||"UnknownError",lineNumber:d,fileName:e,stack:b||"Not available"}}a.stack=
b;return a}
function dc(a,b){b||(b={});b[fc(a)]=!0;var c=a.stack||"",d=a.Ha;d&&!b[fc(d)]&&(c+="\nCaused by: ",d.stack&&0==d.stack.indexOf(d.toString())||(c+="string"===typeof d?d:d.message+"\n"),c+=dc(d,b));return c}
function fc(a){var b="";"function"===typeof a.toString&&(b=""+a);return b+a.stack}
var ec={};function gc(a){this.f=a||{cookie:""}}
p=gc.prototype;p.isEnabled=function(){return navigator.cookieEnabled};
p.set=function(a,b,c){var d=!1;if("object"===typeof c){var e=c.Oa;d=c.secure||!1;var f=c.domain||void 0;var g=c.path||void 0;var h=c.V}if(/[;=\s]/.test(a))throw Error('Invalid cookie name "'+a+'"');if(/[;\r\n]/.test(b))throw Error('Invalid cookie value "'+b+'"');void 0===h&&(h=-1);this.f.cookie=a+"="+b+(f?";domain="+f:"")+(g?";path="+g:"")+(0>h?"":0==h?";expires="+(new Date(1970,1,1)).toUTCString():";expires="+(new Date(Date.now()+1E3*h)).toUTCString())+(d?";secure":"")+(null!=e?";samesite="+e:"")};
p.get=function(a,b){for(var c=a+"=",d=(this.f.cookie||"").split(";"),e=0,f;e<d.length;e++){f=sb(d[e]);if(0==f.lastIndexOf(c,0))return f.substr(c.length);if(f==a)return""}return b};
p.remove=function(a,b,c){var d=void 0!==this.get(a);this.set(a,"",{V:0,path:b,domain:c});return d};
p.isEmpty=function(){return!this.f.cookie};
p.clear=function(){for(var a=(this.f.cookie||"").split(";"),b=[],c=[],d,e,f=0;f<a.length;f++)e=sb(a[f]),d=e.indexOf("="),-1==d?(b.push(""),c.push(e)):(b.push(e.substring(0,d)),c.push(e.substring(d+1)));for(a=b.length-1;0<=a;a--)this.remove(b[a])};
var hc=new gc("undefined"==typeof document?null:document);function ic(a,b){this.width=a;this.height=b}
p=ic.prototype;p.clone=function(){return new ic(this.width,this.height)};
p.aspectRatio=function(){return this.width/this.height};
p.isEmpty=function(){return!(this.width*this.height)};
p.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
p.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
p.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};function jc(a,b){var c,d;var e=document;e=b||e;if(e.querySelectorAll&&e.querySelector&&a)return e.querySelectorAll(a?"."+a:"");if(a&&e.getElementsByClassName){var f=e.getElementsByClassName(a);return f}f=e.getElementsByTagName("*");if(a){var g={};for(c=d=0;e=f[c];c++){var h=e.className,k;if(k="function"==typeof h.split)k=0<=Za(h.split(/\s+/),a);k&&(g[d++]=e)}g.length=d;return g}return f}
function kc(){var a=document;var b="IFRAME";"application/xhtml+xml"===a.contentType&&(b=b.toLowerCase());return a.createElement(b)}
function lc(a,b){for(var c=0;a;){if(b(a))return a;a=a.parentNode;c++}return null}
;var mc=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^\\/?#]*)@)?([^\\/?#]*?)(?::([0-9]+))?(?=[\\/?#]|$))?([^?#]+)?(?:\?([^#]*))?(?:#([\s\S]*))?$/;function nc(a){return a?decodeURI(a):a}
function L(a){return nc(a.match(mc)[3]||null)}
function oc(a){var b=a.match(mc);a=b[1];var c=b[2],d=b[3];b=b[4];var e="";a&&(e+=a+":");d&&(e+="//",c&&(e+=c+"@"),e+=d,b&&(e+=":"+b));return e}
function pc(a,b,c){if(Array.isArray(b))for(var d=0;d<b.length;d++)pc(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function qc(a){var b=[],c;for(c in a)pc(c,a[c],b);return b.join("&")}
var rc=/#|$/;function sc(a){var b=tc;if(b)for(var c in b)Object.prototype.hasOwnProperty.call(b,c)&&a.call(void 0,b[c],c,b)}
function uc(){var a=[];sc(function(b){a.push(b)});
return a}
var tc={ta:"allow-forms",ua:"allow-modals",va:"allow-orientation-lock",wa:"allow-pointer-lock",xa:"allow-popups",ya:"allow-popups-to-escape-sandbox",za:"allow-presentation",Aa:"allow-same-origin",Ba:"allow-scripts",Ca:"allow-top-navigation",Da:"allow-top-navigation-by-user-activation"},vc=jb(function(){return uc()});
function wc(){var a=kc(),b={};H(vc(),function(c){a.sandbox&&a.sandbox.supports&&a.sandbox.supports(c)&&(b[c]=!0)});
return b}
;function xc(){this.h=this.h;this.i=this.i}
xc.prototype.h=!1;xc.prototype.dispose=function(){this.h||(this.h=!0,this.O())};
xc.prototype.O=function(){if(this.i)for(;this.i.length;)this.i.shift()()};var yc={};function zc(){}
function Ac(a,b){if(b!==yc)throw Error("Bad secret");this.f=a}
x(Ac,zc);Ac.prototype.toString=function(){return this.f};new Ac("about:blank",yc);new Ac("about:invalid#zTSz",yc);var Bc=(new Date).getTime();function Cc(a){if(!a)return"";a=a.split("#")[0].split("?")[0];a=a.toLowerCase();0==a.indexOf("//")&&(a=window.location.protocol+a);/^[\w\-]*:\/\//.test(a)||(a=window.location.href);var b=a.substring(a.indexOf("://")+3),c=b.indexOf("/");-1!=c&&(b=b.substring(0,c));a=a.substring(0,a.indexOf("://"));if("http"!==a&&"https"!==a&&"chrome-extension"!==a&&"moz-extension"!==a&&"file"!==a&&"android-app"!==a&&"chrome-search"!==a&&"chrome-untrusted"!==a&&"chrome"!==a&&"app"!==a&&"devtools"!==a)throw Error("Invalid URI scheme in origin: "+
a);c="";var d=b.indexOf(":");if(-1!=d){var e=b.substring(d+1);b=b.substring(0,d);if("http"===a&&"80"!==e||"https"===a&&"443"!==e)c=":"+e}return a+"://"+b+c}
;function Dc(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;e[4]=3285377520;m=l=0}
function b(n){for(var r=g,q=0;64>q;q+=4)r[q/4]=n[q]<<24|n[q+1]<<16|n[q+2]<<8|n[q+3];for(q=16;80>q;q++)n=r[q-3]^r[q-8]^r[q-14]^r[q-16],r[q]=(n<<1|n>>>31)&4294967295;n=e[0];var v=e[1],w=e[2],F=e[3],Qa=e[4];for(q=0;80>q;q++){if(40>q)if(20>q){var ma=F^v&(w^F);var Da=1518500249}else ma=v^w^F,Da=1859775393;else 60>q?(ma=v&w|F&(v|w),Da=2400959708):(ma=v^w^F,Da=3395469782);ma=((n<<5|n>>>27)&4294967295)+ma+Qa+Da+r[q]&4294967295;Qa=F;F=w;w=(v<<30|v>>>2)&4294967295;v=n;n=ma}e[0]=e[0]+n&4294967295;e[1]=e[1]+
v&4294967295;e[2]=e[2]+w&4294967295;e[3]=e[3]+F&4294967295;e[4]=e[4]+Qa&4294967295}
function c(n,r){if("string"===typeof n){n=unescape(encodeURIComponent(n));for(var q=[],v=0,w=n.length;v<w;++v)q.push(n.charCodeAt(v));n=q}r||(r=n.length);q=0;if(0==l)for(;q+64<r;)b(n.slice(q,q+64)),q+=64,m+=64;for(;q<r;)if(f[l++]=n[q++],m++,64==l)for(l=0,b(f);q+64<r;)b(n.slice(q,q+64)),q+=64,m+=64}
function d(){var n=[],r=8*m;56>l?c(h,56-l):c(h,64-(l-56));for(var q=63;56<=q;q--)f[q]=r&255,r>>>=8;b(f);for(q=r=0;5>q;q++)for(var v=24;0<=v;v-=8)n[r++]=e[q]>>v&255;return n}
for(var e=[],f=[],g=[],h=[128],k=1;64>k;++k)h[k]=0;var l,m;a();return{reset:a,update:c,digest:d,ha:function(){for(var n=d(),r="",q=0;q<n.length;q++)r+="0123456789ABCDEF".charAt(Math.floor(n[q]/16))+"0123456789ABCDEF".charAt(n[q]%16);return r}}}
;function Ec(a,b,c){var d=[],e=[];if(1==(Array.isArray(c)?2:1))return e=[b,a],H(d,function(h){e.push(h)}),Fc(e.join(" "));
var f=[],g=[];H(c,function(h){g.push(h.key);f.push(h.value)});
c=Math.floor((new Date).getTime()/1E3);e=0==f.length?[c,b,a]:[f.join(":"),c,b,a];H(d,function(h){e.push(h)});
a=Fc(e.join(" "));a=[c,a];0==g.length||a.push(g.join(""));return a.join("_")}
function Fc(a){var b=Dc();b.update(a);return b.ha().toLowerCase()}
;function Gc(a){var b=Cc(String(B.location.href)),c;(c=B.__SAPISID||B.__APISID||B.__OVERRIDE_SID)?c=!0:(c=new gc(document),c=c.get("SAPISID")||c.get("APISID")||c.get("__Secure-3PAPISID")||c.get("SID"),c=!!c);if(c&&(c=(b=0==b.indexOf("https:")||0==b.indexOf("chrome-extension:")||0==b.indexOf("moz-extension:"))?B.__SAPISID:B.__APISID,c||(c=new gc(document),c=c.get(b?"SAPISID":"APISID")||c.get("__Secure-3PAPISID")),c)){b=b?"SAPISIDHASH":"APISIDHASH";var d=String(B.location.href);return d&&c&&b?[b,Ec(Cc(d),
c,a||null)].join(" "):null}return null}
;function Hc(){this.g=[];this.f=-1}
Hc.prototype.set=function(a,b){b=void 0===b?!0:b;0<=a&&52>a&&0===a%1&&this.g[a]!=b&&(this.g[a]=b,this.f=-1)};
Hc.prototype.get=function(a){return!!this.g[a]};
function Ic(a){-1==a.f&&(a.f=$a(a.g,function(b,c,d){return c?b+Math.pow(2,d):b},0));
return a.f}
;function Jc(a,b){this.h=a;this.i=b;this.g=0;this.f=null}
Jc.prototype.get=function(){if(0<this.g){this.g--;var a=this.f;this.f=a.next;a.next=null}else a=this.h();return a};
function Kc(a,b){a.i(b);100>a.g&&(a.g++,b.next=a.f,a.f=b)}
;function Lc(a){B.setTimeout(function(){throw a;},0)}
var Mc;function Nc(){var a=B.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!J("Presto")&&(a=function(){var e=kc();e.style.display="none";document.documentElement.appendChild(e);var f=e.contentWindow;e=f.document;e.open();e.close();var g="callImmediate"+Math.random(),h="file:"==f.location.protocol?"*":f.location.protocol+"//"+f.location.host;e=Wa(function(k){if(("*"==h||k.origin==h)&&k.data==g)this.port1.onmessage()},this);
f.addEventListener("message",e,!1);this.port1={};this.port2={postMessage:function(){f.postMessage(g,h)}}});
if("undefined"!==typeof a&&!J("Trident")&&!J("MSIE")){var b=new a,c={},d=c;b.port1.onmessage=function(){if(void 0!==c.next){c=c.next;var e=c.T;c.T=null;e()}};
return function(e){d.next={T:e};d=d.next;b.port2.postMessage(0)}}return function(e){B.setTimeout(e,0)}}
;function Oc(){this.g=this.f=null}
var Qc=new Jc(function(){return new Pc},function(a){a.reset()});
Oc.prototype.add=function(a,b){var c=Qc.get();c.set(a,b);this.g?this.g.next=c:this.f=c;this.g=c};
Oc.prototype.remove=function(){var a=null;this.f&&(a=this.f,this.f=this.f.next,this.f||(this.g=null),a.next=null);return a};
function Pc(){this.next=this.scope=this.f=null}
Pc.prototype.set=function(a,b){this.f=a;this.scope=b;this.next=null};
Pc.prototype.reset=function(){this.next=this.scope=this.f=null};function Rc(a,b){Sc||Tc();Uc||(Sc(),Uc=!0);Vc.add(a,b)}
var Sc;function Tc(){if(B.Promise&&B.Promise.resolve){var a=B.Promise.resolve(void 0);Sc=function(){a.then(Wc)}}else Sc=function(){var b=Wc;
"function"!==typeof B.setImmediate||B.Window&&B.Window.prototype&&!J("Edge")&&B.Window.prototype.setImmediate==B.setImmediate?(Mc||(Mc=Nc()),Mc(b)):B.setImmediate(b)}}
var Uc=!1,Vc=new Oc;function Wc(){for(var a;a=Vc.remove();){try{a.f.call(a.scope)}catch(b){Lc(b)}Kc(Qc,a)}Uc=!1}
;function Xc(){this.g=-1}
;function Yc(){this.g=64;this.f=[];this.l=[];this.m=[];this.i=[];this.i[0]=128;for(var a=1;a<this.g;++a)this.i[a]=0;this.j=this.h=0;this.reset()}
E(Yc,Xc);Yc.prototype.reset=function(){this.f[0]=1732584193;this.f[1]=4023233417;this.f[2]=2562383102;this.f[3]=271733878;this.f[4]=3285377520;this.j=this.h=0};
function Zc(a,b,c){c||(c=0);var d=a.m;if("string"===typeof b)for(var e=0;16>e;e++)d[e]=b.charCodeAt(c)<<24|b.charCodeAt(c+1)<<16|b.charCodeAt(c+2)<<8|b.charCodeAt(c+3),c+=4;else for(e=0;16>e;e++)d[e]=b[c]<<24|b[c+1]<<16|b[c+2]<<8|b[c+3],c+=4;for(e=16;80>e;e++){var f=d[e-3]^d[e-8]^d[e-14]^d[e-16];d[e]=(f<<1|f>>>31)&4294967295}b=a.f[0];c=a.f[1];var g=a.f[2],h=a.f[3],k=a.f[4];for(e=0;80>e;e++){if(40>e)if(20>e){f=h^c&(g^h);var l=1518500249}else f=c^g^h,l=1859775393;else 60>e?(f=c&g|h&(c|g),l=2400959708):
(f=c^g^h,l=3395469782);f=(b<<5|b>>>27)+f+k+l+d[e]&4294967295;k=h;h=g;g=(c<<30|c>>>2)&4294967295;c=b;b=f}a.f[0]=a.f[0]+b&4294967295;a.f[1]=a.f[1]+c&4294967295;a.f[2]=a.f[2]+g&4294967295;a.f[3]=a.f[3]+h&4294967295;a.f[4]=a.f[4]+k&4294967295}
Yc.prototype.update=function(a,b){if(null!=a){void 0===b&&(b=a.length);for(var c=b-this.g,d=0,e=this.l,f=this.h;d<b;){if(0==f)for(;d<=c;)Zc(this,a,d),d+=this.g;if("string"===typeof a)for(;d<b;){if(e[f]=a.charCodeAt(d),++f,++d,f==this.g){Zc(this,e);f=0;break}}else for(;d<b;)if(e[f]=a[d],++f,++d,f==this.g){Zc(this,e);f=0;break}}this.h=f;this.j+=b}};
Yc.prototype.digest=function(){var a=[],b=8*this.j;56>this.h?this.update(this.i,56-this.h):this.update(this.i,this.g-(this.h-56));for(var c=this.g-1;56<=c;c--)this.l[c]=b&255,b/=256;Zc(this,this.l);for(c=b=0;5>c;c++)for(var d=24;0<=d;d-=8)a[b]=this.f[c]>>d&255,++b;return a};var $c="StopIteration"in B?B.StopIteration:{message:"StopIteration",stack:""};function ad(){}
ad.prototype.next=function(){throw $c;};
ad.prototype.A=function(){return this};
function bd(a){if(a instanceof ad)return a;if("function"==typeof a.A)return a.A(!1);if(Oa(a)){var b=0,c=new ad;c.next=function(){for(;;){if(b>=a.length)throw $c;if(b in a)return a[b++];b++}};
return c}throw Error("Not implemented");}
function wd(a,b){if(Oa(a))try{H(a,b,void 0)}catch(c){if(c!==$c)throw c;}else{a=bd(a);try{for(;;)b.call(void 0,a.next(),void 0,a)}catch(c){if(c!==$c)throw c;}}}
function xd(a){if(Oa(a))return hb(a);a=bd(a);var b=[];wd(a,function(c){b.push(c)});
return b}
;function yd(a,b){this.h={};this.f=[];this.i=this.g=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof yd)for(c=zd(a),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])}
function zd(a){Ad(a);return a.f.concat()}
p=yd.prototype;p.equals=function(a,b){if(this===a)return!0;if(this.g!=a.g)return!1;var c=b||Bd;Ad(this);for(var d,e=0;d=this.f[e];e++)if(!c(this.get(d),a.get(d)))return!1;return!0};
function Bd(a,b){return a===b}
p.isEmpty=function(){return 0==this.g};
p.clear=function(){this.h={};this.i=this.g=this.f.length=0};
p.remove=function(a){return Object.prototype.hasOwnProperty.call(this.h,a)?(delete this.h[a],this.g--,this.i++,this.f.length>2*this.g&&Ad(this),!0):!1};
function Ad(a){if(a.g!=a.f.length){for(var b=0,c=0;b<a.f.length;){var d=a.f[b];Object.prototype.hasOwnProperty.call(a.h,d)&&(a.f[c++]=d);b++}a.f.length=c}if(a.g!=a.f.length){var e={};for(c=b=0;b<a.f.length;)d=a.f[b],Object.prototype.hasOwnProperty.call(e,d)||(a.f[c++]=d,e[d]=1),b++;a.f.length=c}}
p.get=function(a,b){return Object.prototype.hasOwnProperty.call(this.h,a)?this.h[a]:b};
p.set=function(a,b){Object.prototype.hasOwnProperty.call(this.h,a)||(this.g++,this.f.push(a),this.i++);this.h[a]=b};
p.forEach=function(a,b){for(var c=zd(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};
p.clone=function(){return new yd(this)};
p.A=function(a){Ad(this);var b=0,c=this.i,d=this,e=new ad;e.next=function(){if(c!=d.i)throw Error("The map has changed since the iterator was created");if(b>=d.f.length)throw $c;var f=d.f[b++];return a?f:d.h[f]};
return e};var Cd=B.JSON.stringify;function M(a){this.f=0;this.m=void 0;this.i=this.g=this.h=null;this.j=this.l=!1;if(a!=Na)try{var b=this;a.call(void 0,function(c){Dd(b,2,c)},function(c){Dd(b,3,c)})}catch(c){Dd(this,3,c)}}
function Ed(){this.next=this.context=this.onRejected=this.g=this.f=null;this.h=!1}
Ed.prototype.reset=function(){this.context=this.onRejected=this.g=this.f=null;this.h=!1};
var Fd=new Jc(function(){return new Ed},function(a){a.reset()});
function Gd(a,b,c){var d=Fd.get();d.g=a;d.onRejected=b;d.context=c;return d}
function Hd(a){if(a instanceof M)return a;var b=new M(Na);Dd(b,2,a);return b}
function Id(a){return new M(function(b,c){c(a)})}
M.prototype.then=function(a,b,c){return Jd(this,"function"===typeof a?a:null,"function"===typeof b?b:null,c)};
M.prototype.$goog_Thenable=!0;function Kd(a,b){return Jd(a,null,b,void 0)}
M.prototype.cancel=function(a){if(0==this.f){var b=new Ld(a);Rc(function(){Md(this,b)},this)}};
function Md(a,b){if(0==a.f)if(a.h){var c=a.h;if(c.g){for(var d=0,e=null,f=null,g=c.g;g&&(g.h||(d++,g.f==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.f&&1==d?Md(c,b):(f?(d=f,d.next==c.i&&(c.i=d),d.next=d.next.next):Nd(c),Od(c,e,3,b)))}a.h=null}else Dd(a,3,b)}
function Pd(a,b){a.g||2!=a.f&&3!=a.f||Qd(a);a.i?a.i.next=b:a.g=b;a.i=b}
function Jd(a,b,c,d){var e=Gd(null,null,null);e.f=new M(function(f,g){e.g=b?function(h){try{var k=b.call(d,h);f(k)}catch(l){g(l)}}:f;
e.onRejected=c?function(h){try{var k=c.call(d,h);void 0===k&&h instanceof Ld?g(h):f(k)}catch(l){g(l)}}:g});
e.f.h=a;Pd(a,e);return e.f}
M.prototype.v=function(a){this.f=0;Dd(this,2,a)};
M.prototype.G=function(a){this.f=0;Dd(this,3,a)};
function Dd(a,b,c){if(0==a.f){a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself"));a.f=1;a:{var d=c,e=a.v,f=a.G;if(d instanceof M){Pd(d,Gd(e||Na,f||null,a));var g=!0}else{if(d)try{var h=!!d.$goog_Thenable}catch(l){h=!1}else h=!1;if(h)d.then(e,f,a),g=!0;else{if(Pa(d))try{var k=d.then;if("function"===typeof k){Rd(d,k,e,f,a);g=!0;break a}}catch(l){f.call(a,l);g=!0;break a}g=!1}}}g||(a.m=c,a.f=b,a.h=null,Qd(a),3!=b||c instanceof Ld||Sd(a,c))}}
function Rd(a,b,c,d,e){function f(k){h||(h=!0,d.call(e,k))}
function g(k){h||(h=!0,c.call(e,k))}
var h=!1;try{b.call(a,g,f)}catch(k){f(k)}}
function Qd(a){a.l||(a.l=!0,Rc(a.s,a))}
function Nd(a){var b=null;a.g&&(b=a.g,a.g=b.next,b.next=null);a.g||(a.i=null);return b}
M.prototype.s=function(){for(var a;a=Nd(this);)Od(this,a,this.f,this.m);this.l=!1};
function Od(a,b,c,d){if(3==c&&b.onRejected&&!b.h)for(;a&&a.j;a=a.h)a.j=!1;if(b.f)b.f.h=null,Td(b,c,d);else try{b.h?b.g.call(b.context):Td(b,c,d)}catch(e){Ud.call(null,e)}Kc(Fd,b)}
function Td(a,b,c){2==b?a.g.call(a.context,c):a.onRejected&&a.onRejected.call(a.context,c)}
function Sd(a,b){a.j=!0;Rc(function(){a.j&&Ud.call(null,b)})}
var Ud=Lc;function Ld(a){Ya.call(this,a)}
E(Ld,Ya);Ld.prototype.name="cancel";function N(a){xc.call(this);this.m=1;this.j=[];this.l=0;this.f=[];this.g={};this.s=!!a}
E(N,xc);p=N.prototype;p.subscribe=function(a,b,c){var d=this.g[a];d||(d=this.g[a]=[]);var e=this.m;this.f[e]=a;this.f[e+1]=b;this.f[e+2]=c;this.m=e+3;d.push(e);return e};
function Vd(a,b,c){var d=Wd;if(a=d.g[a]){var e=d.f;(a=ab(a,function(f){return e[f+1]==b&&e[f+2]==c}))&&d.L(a)}}
p.L=function(a){var b=this.f[a];if(b){var c=this.g[b];if(0!=this.l)this.j.push(a),this.f[a+1]=Na;else{if(c){var d=Za(c,a);0<=d&&Array.prototype.splice.call(c,d,1)}delete this.f[a];delete this.f[a+1];delete this.f[a+2]}}return!!b};
p.J=function(a,b){var c=this.g[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.s)for(e=0;e<c.length;e++){var g=c[e];Xd(this.f[g+1],this.f[g+2],d)}else{this.l++;try{for(e=0,f=c.length;e<f;e++)g=c[e],this.f[g+1].apply(this.f[g+2],d)}finally{if(this.l--,0<this.j.length&&0==this.l)for(;c=this.j.pop();)this.L(c)}}return 0!=e}return!1};
function Xd(a,b,c){Rc(function(){a.apply(b,c)})}
p.clear=function(a){if(a){var b=this.g[a];b&&(H(b,this.L,this),delete this.g[a])}else this.f.length=0,this.g={}};
p.O=function(){N.F.O.call(this);this.clear();this.j.length=0};function Yd(a){this.f=a}
Yd.prototype.set=function(a,b){void 0===b?this.f.remove(a):this.f.set(a,Cd(b))};
Yd.prototype.get=function(a){try{var b=this.f.get(a)}catch(c){return}if(null!==b)try{return JSON.parse(b)}catch(c){throw"Storage: Invalid value was encountered";}};
Yd.prototype.remove=function(a){this.f.remove(a)};function Zd(a){this.f=a}
E(Zd,Yd);function $d(a){this.data=a}
function ae(a){return void 0===a||a instanceof $d?a:new $d(a)}
Zd.prototype.set=function(a,b){Zd.F.set.call(this,a,ae(b))};
Zd.prototype.g=function(a){a=Zd.F.get.call(this,a);if(void 0===a||a instanceof Object)return a;throw"Storage: Invalid value was encountered";};
Zd.prototype.get=function(a){if(a=this.g(a)){if(a=a.data,void 0===a)throw"Storage: Invalid value was encountered";}else a=void 0;return a};function be(a){this.f=a}
E(be,Zd);be.prototype.set=function(a,b,c){if(b=ae(b)){if(c){if(c<Date.now()){be.prototype.remove.call(this,a);return}b.expiration=c}b.creation=Date.now()}be.F.set.call(this,a,b)};
be.prototype.g=function(a){var b=be.F.g.call(this,a);if(b){var c=b.creation,d=b.expiration;if(d&&d<Date.now()||c&&c>Date.now())be.prototype.remove.call(this,a);else return b}};function ce(){}
;function de(){}
E(de,ce);de.prototype.clear=function(){var a=xd(this.A(!0)),b=this;H(a,function(c){b.remove(c)})};function ee(a){this.f=a}
E(ee,de);p=ee.prototype;p.isAvailable=function(){if(!this.f)return!1;try{return this.f.setItem("__sak","1"),this.f.removeItem("__sak"),!0}catch(a){return!1}};
p.set=function(a,b){try{this.f.setItem(a,b)}catch(c){if(0==this.f.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
p.get=function(a){a=this.f.getItem(a);if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
p.remove=function(a){this.f.removeItem(a)};
p.A=function(a){var b=0,c=this.f,d=new ad;d.next=function(){if(b>=c.length)throw $c;var e=c.key(b++);if(a)return e;e=c.getItem(e);if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return e};
return d};
p.clear=function(){this.f.clear()};
p.key=function(a){return this.f.key(a)};function fe(){var a=null;try{a=window.localStorage||null}catch(b){}this.f=a}
E(fe,ee);function ge(a,b){this.g=a;this.f=null;if(Eb&&!(9<=Number(Yb))){he||(he=new yd);this.f=he.get(a);this.f||(b?this.f=document.getElementById(b):(this.f=document.createElement("userdata"),this.f.addBehavior("#default#userData"),document.body.appendChild(this.f)),he.set(a,this.f));try{this.f.load(this.g)}catch(c){this.f=null}}}
E(ge,de);var ie={".":".2E","!":".21","~":".7E","*":".2A","'":".27","(":".28",")":".29","%":"."},he=null;function je(a){return"_"+encodeURIComponent(a).replace(/[.!~*'()%]/g,function(b){return ie[b]})}
p=ge.prototype;p.isAvailable=function(){return!!this.f};
p.set=function(a,b){this.f.setAttribute(je(a),b);ke(this)};
p.get=function(a){a=this.f.getAttribute(je(a));if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
p.remove=function(a){this.f.removeAttribute(je(a));ke(this)};
p.A=function(a){var b=0,c=this.f.XMLDocument.documentElement.attributes,d=new ad;d.next=function(){if(b>=c.length)throw $c;var e=c[b++];if(a)return decodeURIComponent(e.nodeName.replace(/\./g,"%")).substr(1);e=e.nodeValue;if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return e};
return d};
p.clear=function(){for(var a=this.f.XMLDocument.documentElement,b=a.attributes.length;0<b;b--)a.removeAttribute(a.attributes[b-1].nodeName);ke(this)};
function ke(a){try{a.f.save(a.g)}catch(b){throw"Storage mechanism: Quota exceeded";}}
;function le(a,b){this.g=a;this.f=b+"::"}
E(le,de);le.prototype.set=function(a,b){this.g.set(this.f+a,b)};
le.prototype.get=function(a){return this.g.get(this.f+a)};
le.prototype.remove=function(a){this.g.remove(this.f+a)};
le.prototype.A=function(a){var b=this.g.A(!0),c=this,d=new ad;d.next=function(){for(var e=b.next();e.substr(0,c.f.length)!=c.f;)e=b.next();return a?e.substr(c.f.length):c.g.get(e)};
return d};var me=window.yt&&window.yt.config_||window.ytcfg&&window.ytcfg.data_||{};D("yt.config_",me);function ne(a){var b=arguments;1<b.length?me[b[0]]=b[1]:1===b.length&&Object.assign(me,b[0])}
function P(a,b){return a in me?me[a]:b}
;var oe=[];function pe(a){oe.forEach(function(b){return b(a)})}
function qe(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){re(b),pe(b)}}:a}
function re(a){var b=C("yt.logging.errors.log");b?b(a,"ERROR",void 0,void 0,void 0):(b=P("ERRORS",[]),b.push([a,"ERROR",void 0,void 0,void 0]),ne("ERRORS",b))}
function se(a){var b=C("yt.logging.errors.log");b?b(a,"WARNING",void 0,void 0,void 0):(b=P("ERRORS",[]),b.push([a,"WARNING",void 0,void 0,void 0]),ne("ERRORS",b))}
;var te=0;D("ytDomDomGetNextId",C("ytDomDomGetNextId")||function(){return++te});var ue={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function ve(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.ctrlKey=this.altKey=!1;this.clientY=this.clientX=0;this.changedTouches=this.touches=null;try{if(a=a||window.event){this.event=a;for(var b in a)b in ue||(this[b]=a[b]);var c=a.target||a.srcElement;c&&3==c.nodeType&&(c=c.parentNode);this.target=c;var d=a.relatedTarget;if(d)try{d=d.nodeName?d:null}catch(e){d=null}else"mouseover"==
this.type?d=a.fromElement:"mouseout"==this.type&&(d=a.toElement);this.relatedTarget=d;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey}}catch(e){}}
ve.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
ve.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
ve.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var mb=B.ytEventsEventsListeners||{};D("ytEventsEventsListeners",mb);var we=B.ytEventsEventsCounter||{count:0};D("ytEventsEventsCounter",we);
function xe(a,b,c,d){d=void 0===d?{}:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return lb(function(e){var f="boolean"===typeof e[4]&&e[4]==!!d,g=Pa(e[4])&&Pa(d)&&nb(e[4],d);return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&(f||g)})}
function ye(a){a&&("string"==typeof a&&(a=[a]),H(a,function(b){if(b in mb){var c=mb[b],d=c[0],e=c[1],f=c[3];c=c[4];d.removeEventListener?ze()||"boolean"===typeof c?d.removeEventListener(e,f,c):d.removeEventListener(e,f,!!c.capture):d.detachEvent&&d.detachEvent("on"+e,f);delete mb[b]}}))}
var ze=jb(function(){var a=!1;try{var b=Object.defineProperty({},"capture",{get:function(){a=!0}});
window.addEventListener("test",null,b)}catch(c){}return a});
function Ae(a,b,c){var d=void 0===d?{}:d;if(a&&(a.addEventListener||a.attachEvent)){var e=xe(a,b,c,d);if(!e){e=++we.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(h){h=new ve(h);if(!lc(h.relatedTarget,function(k){return k==a}))return h.currentTarget=a,h.type=b,c.call(a,h)}:function(h){h=new ve(h);
h.currentTarget=a;return c.call(a,h)};
g=qe(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),ze()||"boolean"===typeof d?a.addEventListener(b,g,d):a.addEventListener(b,g,!!d.capture)):a.attachEvent("on"+b,g);mb[e]=[a,b,c,g,d]}}}
;function Be(a,b){"function"===typeof a&&(a=qe(a));return window.setTimeout(a,b)}
function Ce(a){"function"===typeof a&&(a=qe(a));return window.setInterval(a,250)}
;function De(a){var b=[];kb(a,function(c,d){var e=encodeURIComponent(String(d)),f;Array.isArray(c)?f=c:f=[c];H(f,function(g){""==g?b.push(e):b.push(e+"="+encodeURIComponent(String(g)))})});
return b.join("&")}
function Ee(a){"?"==a.charAt(0)&&(a=a.substr(1));a=a.split("&");for(var b={},c=0,d=a.length;c<d;c++){var e=a[c].split("=");if(1==e.length&&e[0]||2==e.length)try{var f=decodeURIComponent((e[0]||"").replace(/\+/g," ")),g=decodeURIComponent((e[1]||"").replace(/\+/g," "));f in b?Array.isArray(b[f])?ib(b[f],g):b[f]=[b[f],g]:b[f]=g}catch(k){if("q"!=e[0]){var h=Error("Error decoding URL component");h.params={key:e[0],value:e[1]};re(h)}}}return b}
function Fe(a,b,c){var d=a.split("#",2);a=d[0];d=1<d.length?"#"+d[1]:"";var e=a.split("?",2);a=e[0];e=Ee(e[1]||"");for(var f in b)!c&&null!==e&&f in e||(e[f]=b[f]);b=a;a=qc(e);a?(c=b.indexOf("#"),0>c&&(c=b.length),f=b.indexOf("?"),0>f||f>c?(f=c,e=""):e=b.substring(f+1,c),b=[b.substr(0,f),e,b.substr(c)],c=b[1],b[1]=a?c?c+"&"+a:a:c,a=b[0]+(b[1]?"?"+b[1]:"")+b[2]):a=b;return a+d}
;var Ge={};function He(a){return Ge[a]||(Ge[a]=String(a).replace(/\-([a-z])/g,function(b,c){return c.toUpperCase()}))}
;var Ie={},Je=[],Wd=new N,Ke={};function Le(){for(var a=u(Je),b=a.next();!b.done;b=a.next())b=b.value,b()}
function Me(a,b){b||(b=document);var c=hb(b.getElementsByTagName("yt:"+a));var d="yt-"+a;var e=b||document;d=e.querySelectorAll&&e.querySelector?e.querySelectorAll("."+d):jc(d,b);d=hb(d);return bb(c,d)}
function Q(a,b){var c;"yt:"==a.tagName.toLowerCase().substr(0,3)?c=a.getAttribute(b):c=a?a.dataset?a.dataset[He(b)]:a.getAttribute("data-"+b):null;return c}
function Ne(a,b){Wd.J.apply(Wd,arguments)}
;function Oe(a){this.g=a||{};this.h=this.f=!1;a=document.getElementById("www-widgetapi-script");if(this.f=!!("https:"==document.location.protocol||a&&0==a.src.indexOf("https:"))){a=[this.g,window.YTConfig||{}];for(var b=0;b<a.length;b++)a[b].host&&(a[b].host=a[b].host.replace("http://","https://"))}}
function S(a,b){for(var c=[a.g,window.YTConfig||{}],d=0;d<c.length;d++){var e=c[d][b];if(void 0!=e)return e}return null}
function Pe(a,b,c){Qe||(Qe={},Ae(window,"message",Wa(a.i,a)));Qe[c]=b}
Oe.prototype.i=function(a){if(a.origin==S(this,"host")||a.origin==S(this,"host").replace(/^http:/,"https:")){try{var b=JSON.parse(a.data)}catch(c){return}this.h=!0;this.f||0!=a.origin.indexOf("https:")||(this.f=!0);if(a=Qe[b.id])a.s=!0,a.s&&(H(a.m,a.S,a),a.m.length=0),a.ba(b)}};
var Qe=null;function T(a){a=Re(a);return"string"===typeof a&&"false"===a?!1:!!a}
function Se(a,b){var c=Re(a);return void 0===c&&void 0!==b?b:Number(c||0)}
function Re(a){var b=P("EXPERIMENTS_FORCED_FLAGS",{});return void 0!==b[a]?b[a]:P("EXPERIMENT_FLAGS",{})[a]}
;function Te(){}
function Ue(a,b){return Ve(a,0,b)}
;function We(){}
x(We,Te);function Ve(a,b,c){isNaN(c)&&(c=void 0);var d=C("yt.scheduler.instance.addJob");return d?d(a,b,c):void 0===c?(a(),NaN):Be(a,c||0)}
We.prototype.start=function(){var a=C("yt.scheduler.instance.start");a&&a()};
We.f=void 0;We.g=function(){We.f||(We.f=new We)};
We.g();var Xe=B.ytPubsubPubsubInstance||new N,Ye=B.ytPubsubPubsubSubscribedKeys||{},Ze=B.ytPubsubPubsubTopicToKeys||{},$e=B.ytPubsubPubsubIsSynchronous||{};N.prototype.subscribe=N.prototype.subscribe;N.prototype.unsubscribeByKey=N.prototype.L;N.prototype.publish=N.prototype.J;N.prototype.clear=N.prototype.clear;D("ytPubsubPubsubInstance",Xe);D("ytPubsubPubsubTopicToKeys",Ze);D("ytPubsubPubsubIsSynchronous",$e);D("ytPubsubPubsubSubscribedKeys",Ye);var af=window,U=af.ytcsi&&af.ytcsi.now?af.ytcsi.now:af.performance&&af.performance.timing&&af.performance.now&&af.performance.timing.navigationStart?function(){return af.performance.timing.navigationStart+af.performance.now()}:function(){return(new Date).getTime()};var bf=Se("initial_gel_batch_timeout",1E3),cf=Math.pow(2,16)-1,df=null,ef=0,ff=void 0,gf=0,hf=0,jf=0,Qf=!0,Rf=B.ytLoggingTransportLogPayloadsQueue_||{};D("ytLoggingTransportLogPayloadsQueue_",Rf);var Sf=B.ytLoggingTransportGELQueue_||new Map;D("ytLoggingTransportGELQueue_",Sf);var Tf=B.ytLoggingTransportTokensToCttTargetIds_||{};D("ytLoggingTransportTokensToCttTargetIds_",Tf);
function Uf(){window.clearTimeout(gf);window.clearTimeout(hf);hf=0;ff&&ff.isReady()?(Vf(Sf),"log_event"in Rf&&Vf(Object.entries(Rf.log_event)),Sf.clear(),delete Rf.log_event):Wf()}
function Wf(){T("web_gel_timeout_cap")&&!hf&&(hf=Be(Uf,6E4));window.clearTimeout(gf);var a=P("LOGGING_BATCH_TIMEOUT",Se("web_gel_debounce_ms",1E4));T("shorten_initial_gel_batch_timeout")&&Qf&&(a=bf);gf=Be(Uf,a)}
function Vf(a){var b=ff,c=Math.round(U());a=u(a);for(var d=a.next();!d.done;d=a.next()){var e=u(d.value);d=e.next().value;var f=e.next().value;e=ob({context:Xf(b.f||Yf())});e.events=f;(f=Tf[d])&&Zf(e,d,f);delete Tf[d];$f(e,c);ag(b,"log_event",e,{retry:!0,onSuccess:function(){ef=Math.round(U()-c)}});
Qf=!1}}
function $f(a,b){a.requestTimeMs=String(b);T("unsplit_gel_payloads_in_logs")&&(a.unsplitGelPayloadsInLogs=!0);var c=P("EVENT_ID",void 0);if(c){var d=P("BATCH_CLIENT_COUNTER",void 0)||0;!d&&T("web_client_counter_random_seed")&&(d=Math.floor(Math.random()*cf/2));d++;d>cf&&(d=1);ne("BATCH_CLIENT_COUNTER",d);c={serializedEventId:c,clientCounter:String(d)};a.serializedClientEventId=c;df&&ef&&T("log_gel_rtt_web")&&(a.previousBatchInfo={serializedClientEventId:df,roundtripMs:String(ef)});df=c;ef=0}}
function Zf(a,b,c){if(c.videoId)var d="VIDEO";else if(c.playlistId)d="PLAYLIST";else return;a.credentialTransferTokenTargetId=c;a.context=a.context||{};a.context.user=a.context.user||{};a.context.user.credentialTransferTokens=[{token:b,scope:d}]}
;var bg=B.ytLoggingGelSequenceIdObj_||{};D("ytLoggingGelSequenceIdObj_",bg);function cg(a){var b=dg;a=void 0===a?C("yt.ads.biscotti.lastId_")||"":a;b=Object.assign(eg(b),fg(b));b.ca_type="image";a&&(b.bid=a);return b}
function eg(a){var b={};b.dt=Bc;b.flash="0";a:{try{var c=a.f.top.location.href}catch(f){a=2;break a}a=c?c===a.g.location.href?0:1:2}b=(b.frm=a,b);b.u_tz=-(new Date).getTimezoneOffset();var d=void 0===d?K:d;try{var e=d.history.length}catch(f){e=0}b.u_his=e;b.u_java=!!K.navigator&&"unknown"!==typeof K.navigator.javaEnabled&&!!K.navigator.javaEnabled&&K.navigator.javaEnabled();K.screen&&(b.u_h=K.screen.height,b.u_w=K.screen.width,b.u_ah=K.screen.availHeight,b.u_aw=K.screen.availWidth,b.u_cd=K.screen.colorDepth);
K.navigator&&K.navigator.plugins&&(b.u_nplug=K.navigator.plugins.length);K.navigator&&K.navigator.mimeTypes&&(b.u_nmime=K.navigator.mimeTypes.length);return b}
function fg(a){var b=a.f;try{var c=b.screenX;var d=b.screenY}catch(n){}try{var e=b.outerWidth;var f=b.outerHeight}catch(n){}try{var g=b.innerWidth;var h=b.innerHeight}catch(n){}b=[b.screenLeft,b.screenTop,c,d,b.screen?b.screen.availWidth:void 0,b.screen?b.screen.availTop:void 0,e,f,g,h];c=a.f.top;try{var k=(c||window).document,l="CSS1Compat"==k.compatMode?k.documentElement:k.body;var m=(new ic(l.clientWidth,l.clientHeight)).round()}catch(n){m=new ic(-12245933,-12245933)}k=m;m={};l=new Hc;B.SVGElement&&
B.document.createElementNS&&l.set(0);c=wc();c["allow-top-navigation-by-user-activation"]&&l.set(1);c["allow-popups-to-escape-sandbox"]&&l.set(2);B.crypto&&B.crypto.subtle&&l.set(3);B.TextDecoder&&B.TextEncoder&&l.set(4);l=Ic(l);m.bc=l;m.bih=k.height;m.biw=k.width;m.brdim=b.join();a=a.g;return m.vis={visible:1,hidden:2,prerender:3,preview:4,unloaded:5}[a.visibilityState||a.webkitVisibilityState||a.mozVisibilityState||""]||0,m.wgl=!!K.WebGLRenderingContext,m}
var dg=new function(){var a=window.document;this.f=window;this.g=a};
D("yt.ads_.signals_.getAdSignalsString",function(a){return De(cg(a))});var gg="XMLHttpRequest"in B?function(){return new XMLHttpRequest}:null;
function hg(){if(!gg)return null;var a=gg();return"open"in a?a:null}
;var ig={Authorization:"AUTHORIZATION","X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-YouTube-Device":"DEVICE","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL","X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},jg="app debugcss debugjs expflag force_ad_params force_viral_ad_response_params forced_experiments innertube_snapshots innertube_goldens internalcountrycode internalipoverride absolute_experiments conditional_experiments sbb sr_bns_address client_dev_root_url".split(" "),
kg=!1;
function lg(a,b){b=void 0===b?{}:b;if(!c)var c=window.location.href;var d=a.match(mc)[1]||null,e=L(a);d&&e?(d=c,c=a.match(mc),d=d.match(mc),c=c[3]==d[3]&&c[1]==d[1]&&c[4]==d[4]):c=e?L(c)==e&&(Number(c.match(mc)[4]||null)||null)==(Number(a.match(mc)[4]||null)||null):!0;d=T("web_ajax_ignore_global_headers_if_set");for(var f in ig)e=P(ig[f]),!e||!c&&L(a)||d&&void 0!==b[f]||(b[f]=e);if(c||!L(a))b["X-YouTube-Utc-Offset"]=String(-(new Date).getTimezoneOffset());(c||!L(a))&&(f="undefined"!=typeof Intl?(new Intl.DateTimeFormat).resolvedOptions().timeZone:
null)&&(b["X-YouTube-Time-Zone"]=f);if(c||!L(a))b["X-YouTube-Ad-Signals"]=De(cg(void 0));return b}
function mg(a){var b=window.location.search,c=L(a),d=nc(a.match(mc)[5]||null);d=(c=c&&(c.endsWith("youtube.com")||c.endsWith("youtube-nocookie.com")))&&d&&d.startsWith("/api/");if(!c||d)return a;var e=Ee(b),f={};H(jg,function(g){e[g]&&(f[g]=e[g])});
return Fe(a,f||{},!1)}
function ng(a,b){if(window.fetch&&"XML"!=b.format){var c={method:b.method||"GET",credentials:"same-origin"};b.headers&&(c.headers=b.headers);a=og(a,b);var d=pg(a,b);d&&(c.body=d);b.withCredentials&&(c.credentials="include");var e=!1,f;fetch(a,c).then(function(g){if(!e){e=!0;f&&window.clearTimeout(f);var h=g.ok,k=function(l){l=l||{};var m=b.context||B;h?b.onSuccess&&b.onSuccess.call(m,l,g):b.onError&&b.onError.call(m,l,g);b.P&&b.P.call(m,l,g)};
"JSON"==(b.format||"JSON")&&(h||400<=g.status&&500>g.status)?g.json().then(k,function(){k(null)}):k(null)}});
b.Y&&0<b.timeout&&(f=Be(function(){e||(e=!0,window.clearTimeout(f),b.Y.call(b.context||B))},b.timeout))}else qg(a,b)}
function qg(a,b){var c=b.format||"JSON";a=og(a,b);var d=pg(a,b),e=!1,f=rg(a,function(k){if(!e){e=!0;h&&window.clearTimeout(h);a:switch(k&&"status"in k?k.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:var l=!0;break a;default:l=!1}var m=null,n=400<=k.status&&500>k.status,r=500<=k.status&&600>k.status;if(l||n||r)m=sg(a,c,k,b.Ia);if(l)a:if(k&&204==k.status)l=!0;else{switch(c){case "XML":l=0==parseInt(m&&m.return_code,10);break a;case "RAW":l=!0;break a}l=!!m}m=m||
{};n=b.context||B;l?b.onSuccess&&b.onSuccess.call(n,k,m):b.onError&&b.onError.call(n,k,m);b.P&&b.P.call(n,k,m)}},b.method,d,b.headers,b.responseType,b.withCredentials);
if(b.I&&0<b.timeout){var g=b.I;var h=Be(function(){e||(e=!0,f.abort(),window.clearTimeout(h),g.call(b.context||B,f))},b.timeout)}}
function og(a,b){b.Ma&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=P("XSRF_FIELD_NAME",void 0),d=b.ra;d&&(d[c]&&delete d[c],a=Fe(a,d||{},!0));return a}
function pg(a,b){var c=P("XSRF_FIELD_NAME",void 0),d=P("XSRF_TOKEN",void 0),e=b.postBody||"",f=b.u,g=P("XSRF_FIELD_NAME",void 0),h;b.headers&&(h=b.headers["Content-Type"]);b.La||L(a)&&!b.withCredentials&&L(a)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.u&&b.u[g]||(f||(f={}),f[c]=d);f&&"string"===typeof e&&(e=Ee(e),qb(e,f),e=b.aa&&"JSON"==b.aa?JSON.stringify(e):qc(e));if(!(c=e)&&(c=f)){a:{for(var k in f){f=!1;break a}f=!0}c=!f}!kg&&c&&"POST"!=b.method&&
(kg=!0,re(Error("AJAX request with postData should use POST")));return e}
function sg(a,b,c,d){var e=null;switch(b){case "JSON":try{var f=c.responseText}catch(g){throw d=Error("Error reading responseText"),d.params=a,se(d),g;}a=c.getResponseHeader("Content-Type")||"";f&&0<=a.indexOf("json")&&(e=JSON.parse(f));break;case "XML":if(a=(a=c.responseXML)?tg(a):null)e={},H(a.getElementsByTagName("*"),function(g){e[g.tagName]=ug(g)})}d&&vg(e);
return e}
function vg(a){if(Pa(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;var d=a[b];if(void 0===rb){var e=null;var f=B.trustedTypes;if(f&&f.createPolicy){try{e=f.createPolicy("goog#html",{createHTML:Xa,createScript:Xa,createScriptURL:Xa})}catch(g){B.console&&B.console.error(g.message)}rb=e}else rb=e}(e=rb)&&e.createHTML(d);a[c]=new Cb}else vg(a[b])}}
function tg(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function ug(a){var b="";H(a.childNodes,function(c){b+=c.nodeValue});
return b}
function rg(a,b,c,d,e,f,g){function h(){4==(k&&"readyState"in k?k.readyState:0)&&b&&qe(b)(k)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var k=hg();if(!k)return null;"onloadend"in k?k.addEventListener("loadend",h,!1):k.onreadystatechange=h;T("debug_forward_web_query_parameters")&&(a=mg(a));k.open(c,a,!0);f&&(k.responseType=f);g&&(k.withCredentials=!0);c="POST"==c&&(void 0===window.FormData||!(d instanceof FormData));if(e=lg(a,e))for(var l in e)k.setRequestHeader(l,e[l]),"content-type"==l.toLowerCase()&&(c=!1);c&&k.setRequestHeader("Content-Type","application/x-www-form-urlencoded");k.send(d);
return k}
;function wg(){for(var a={},b=u(Object.entries(Ee(P("DEVICE","")))),c=b.next();!c.done;c=b.next()){var d=u(c.value);c=d.next().value;d=d.next().value;"cbrand"===c?a.deviceMake=d:"cmodel"===c?a.deviceModel=d:"cbr"===c?a.browserName=d:"cbrver"===c?a.browserVersion=d:"cos"===c?a.osName=d:"cosver"===c?a.osVersion=d:"cplatform"===c&&(a.platform=d)}return a}
;function xg(){return"INNERTUBE_API_KEY"in me&&"INNERTUBE_API_VERSION"in me}
function Yf(){return{innertubeApiKey:P("INNERTUBE_API_KEY",void 0),innertubeApiVersion:P("INNERTUBE_API_VERSION",void 0),ja:P("INNERTUBE_CONTEXT_CLIENT_CONFIG_INFO"),ka:P("INNERTUBE_CONTEXT_CLIENT_NAME","WEB"),innertubeContextClientVersion:P("INNERTUBE_CONTEXT_CLIENT_VERSION",void 0),ma:P("INNERTUBE_CONTEXT_HL",void 0),la:P("INNERTUBE_CONTEXT_GL",void 0),na:P("INNERTUBE_HOST_OVERRIDE",void 0)||"",pa:!!P("INNERTUBE_USE_THIRD_PARTY_AUTH",!1),oa:!!P("INNERTUBE_OMIT_API_KEY_WHEN_AUTH_HEADER_IS_PRESENT",
!1),appInstallData:P("SERIALIZED_CLIENT_CONFIG_DATA",void 0)}}
function Xf(a){var b={client:{hl:a.ma,gl:a.la,clientName:a.ka,clientVersion:a.innertubeContextClientVersion,configInfo:a.ja}},c=window.devicePixelRatio;c&&1!=c&&(b.client.screenDensityFloat=String(c));c=P("EXPERIMENTS_TOKEN","");""!==c&&(b.client.experimentsToken=c);c=[];var d=P("EXPERIMENTS_FORCED_FLAGS",{});for(e in d)c.push({key:e,value:String(d[e])});var e=P("EXPERIMENT_FLAGS",{});for(var f in e)f.startsWith("force_")&&void 0===d[f]&&c.push({key:f,value:String(e[f])});0<c.length&&(b.request={internalExperimentFlags:c});
a.appInstallData&&T("web_log_app_install_experiments")&&(b.client.configInfo=b.client.configInfo||{},b.client.configInfo.appInstallData=a.appInstallData);P("DELEGATED_SESSION_ID")&&!T("pageid_as_header_web")&&(b.user={onBehalfOfUser:P("DELEGATED_SESSION_ID")});b.client=Object.assign(b.client,wg());return b}
function yg(a,b,c){c=void 0===c?{}:c;var d={"X-Goog-Visitor-Id":c.visitorData||P("VISITOR_DATA","")};if(b&&b.includes("www.youtube-nocookie.com"))return d;(b=c.Fa||P("AUTHORIZATION"))||(a?b="Bearer "+C("gapi.auth.getToken")().Ea:b=Gc([]));b&&(d.Authorization=b,d["X-Goog-AuthUser"]=P("SESSION_INDEX",0),T("pageid_as_header_web")&&(d["X-Goog-PageId"]=P("DELEGATED_SESSION_ID")));return d}
;function zg(a){a=Object.assign({},a);delete a.Authorization;var b=Gc();if(b){var c=new Yc;c.update(P("INNERTUBE_API_KEY",void 0));c.update(b);b=c.digest();c=3;Oa(b);void 0===c&&(c=0);if(!bc){bc={};for(var d="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split(""),e=["+/=","+/","-_=","-_.","-_"],f=0;5>f;f++){var g=d.concat(e[f].split(""));ac[f]=g;for(var h=0;h<g.length;h++){var k=g[h];void 0===bc[k]&&(bc[k]=h)}}}c=ac[c];d=[];for(e=0;e<b.length;e+=3){var l=b[e],m=(f=e+1<b.length)?
b[e+1]:0;k=(g=e+2<b.length)?b[e+2]:0;h=l>>2;l=(l&3)<<4|m>>4;m=(m&15)<<2|k>>6;k&=63;g||(k=64,f||(m=64));d.push(c[h],c[l],c[m]||"",c[k]||"")}a.hash=d.join("")}return a}
function Ag(a){a=zg(a);var b=new Yc;b.update(JSON.stringify(a,Object.keys(a).sort()));a=b.digest();b="";for(var c=0;c<a.length;c++)b+="0123456789ABCDEF".charAt(Math.floor(a[c]/16))+"0123456789ABCDEF".charAt(a[c]%16);return b}
;function Bg(){var a=new fe;(a=a.isAvailable()?new le(a,"yt.innertube"):null)||(a=new ge("yt.innertube"),a=a.isAvailable()?a:null);this.f=a?new be(a):null;this.g=document.domain||window.location.hostname}
Bg.prototype.set=function(a,b,c,d){c=c||31104E3;this.remove(a);if(this.f)try{this.f.set(a,b,Date.now()+1E3*c);return}catch(f){}var e="";if(d)try{e=escape(Cd(b))}catch(f){return}else e=escape(b);b=this.g;hc.set(""+a,e,{V:c,path:"/",domain:void 0===b?"youtube.com":b,secure:!1})};
Bg.prototype.get=function(a,b){var c=void 0,d=!this.f;if(!d)try{c=this.f.get(a)}catch(e){d=!0}if(d&&(c=hc.get(""+a,void 0))&&(c=unescape(c),b))try{c=JSON.parse(c)}catch(e){this.remove(a),c=void 0}return c};
Bg.prototype.remove=function(a){this.f&&this.f.remove(a);var b=this.g;hc.remove(""+a,"/",void 0===b?"youtube.com":b)};var Cg;function Dg(){Cg||(Cg=new Bg);return Cg}
function Eg(a,b,c,d){if(d)return null;d=Dg().get("nextId",!0)||1;var e=Dg().get("requests",!0)||{};e[d]={method:a,request:b,authState:zg(c),requestTime:Math.round(U())};Dg().set("nextId",d+1,86400,!0);Dg().set("requests",e,86400,!0);return d}
function Fg(a){var b=Dg().get("requests",!0)||{};delete b[a];Dg().set("requests",b,86400,!0)}
function Gg(a){var b=Dg().get("requests",!0);if(b){for(var c in b){var d=b[c];if(!(6E4>Math.round(U())-d.requestTime)){var e=d.authState,f=zg(yg(!1));nb(e,f)&&(e=d.request,"requestTimeMs"in e&&(e.requestTimeMs=Math.round(U())),ag(a,d.method,e,{}));delete b[c]}}Dg().set("requests",b,86400,!0)}}
;function Hg(){}
;var Ig=Zb||$b;function Jg(){var a=/WebKit\/([0-9]+)/.exec(I);return!!(a&&600<=parseInt(a[1],10))}
function Kg(){var a=/WebKit\/([0-9]+)/.exec(I);return!!(a&&602<=parseInt(a[1],10))}
;function Lg(a){if(!a)throw Error();throw a;}
function Mg(a){return a}
function V(a){var b=this;this.g=a;this.state={status:"PENDING"};this.f=[];this.onRejected=[];this.g(function(c){if("PENDING"===b.state.status){b.state={status:"FULFILLED",value:c};c=u(b.f);for(var d=c.next();!d.done;d=c.next())d=d.value,d()}},function(c){if("PENDING"===b.state.status){b.state={status:"REJECTED",
reason:c};c=u(b.onRejected);for(var d=c.next();!d.done;d=c.next())d=d.value,d()}})}
V.all=function(a){return new V(function(b,c){var d=[],e=a.length;0===e&&b(d);for(var f={D:0};f.D<a.length;f={D:f.D},++f.D)Ng(V.resolve(a[f.D]).then(function(g){return function(h){d[g.D]=h;e--;0===e&&b(d)}}(f)),function(g){c(g)})})};
V.resolve=function(a){return new V(function(b,c){a instanceof V?a.then(b,c):b(a)})};
V.reject=function(a){return new V(function(b,c){c(a)})};
V.prototype.then=function(a,b){var c=this,d=null!==a&&void 0!==a?a:Mg,e=null!==b&&void 0!==b?b:Lg;return new V(function(f,g){"PENDING"===c.state.status?(c.f.push(function(){Og(c,c,d,f,g)}),c.onRejected.push(function(){Pg(c,c,e,f,g)})):"FULFILLED"===c.state.status?Og(c,c,d,f,g):"REJECTED"===c.state.status&&Pg(c,c,e,f,g)})};
function Ng(a,b){a.then(void 0,b)}
function Og(a,b,c,d,e){try{if("FULFILLED"!==a.state.status)throw Error("calling handleResolve before the promise is fulfilled.");var f=c(a.state.value);f instanceof V?Qg(a,b,f,d,e):d(f)}catch(g){e(g)}}
function Pg(a,b,c,d,e){try{if("REJECTED"!==a.state.status)throw Error("calling handleReject before the promise is rejected.");var f=c(a.state.reason);f instanceof V?Qg(a,b,f,d,e):d(f)}catch(g){e(g)}}
function Qg(a,b,c,d,e){b===c?e(new TypeError("Circular promise chain detected.")):c.then(function(f){f instanceof V?Qg(a,b,f,d,e):d(f)},function(f){e(f)})}
;function Rg(){var a=Error.call(this,"Transaction was aborted");this.message=a.message;"stack"in a&&(this.stack=a.stack);this.name="YtIdbKnownError";Object.setPrototypeOf(this,Rg.prototype)}
x(Rg,Error);function Sg(){var a=Error.call(this,"IndexedDB is not supported.");this.message=a.message;"stack"in a&&(this.stack=a.stack);this.name="YtIdbKnownError";Object.setPrototypeOf(this,Sg.prototype)}
x(Sg,Error);function Tg(){var a=Error.call(this,"The current transaction exceeded its quota limitations.");this.message=a.message;"stack"in a&&(this.stack=a.stack);this.name="YtIdbKnownError";Object.setPrototypeOf(this,Tg.prototype)}
x(Tg,Error);function Ug(){var a=Error.call(this,"The current transaction may have failed because of exceeding quota limitations.");this.message=a.message;"stack"in a&&(this.stack=a.stack);this.name="YtIdbKnownError";Object.setPrototypeOf(this,Ug.prototype)}
x(Ug,Error);function Vg(a){return a instanceof DOMException?"VersionError"===a.name:"DOMError"in self&&a instanceof DOMError?"VersionError"===a.name:a instanceof Object&&"message"in a?"An attempt was made to open a database using a lower version than the existing version."===a.message:!1}
function Wg(a,b){return new V(function(c,d){function e(){var f=a?b(a):null;f?f.then(function(g){a=g;e()},d):c()}
e()})}
;function Xg(a,b,c){function d(){c(a.error);f()}
function e(){b(a.result);f()}
function f(){try{a.removeEventListener("success",e),a.removeEventListener("error",d)}catch(g){}}
a.addEventListener("success",e);a.addEventListener("error",d)}
function Yg(a){return new M(function(b,c){Xg(a,b,c)})}
function X(a){return new V(function(b,c){Xg(a,b,c)})}
;function Zg(a,b){this.f=a;this.options=b}
p=Zg.prototype;p.add=function(a,b,c){return $g(this,[a],"readwrite",function(d){return ah(d,a).add(b,c)})};
p.clear=function(a){return $g(this,[a],"readwrite",function(b){return ah(b,a).clear()})};
p.close=function(){var a;this.f.close();(null===(a=this.options)||void 0===a?0:a.closed)&&this.options.closed()};
p.count=function(a,b){return $g(this,[a],"readonly",function(c){return ah(c,a).count(b)})};
function bh(a,b,c){a=a.f.createObjectStore(b,c);return new ch(a)}
p["delete"]=function(a,b){return $g(this,[a],"readwrite",function(c){return ah(c,a)["delete"](b)})};
p.get=function(a,b){return $g(this,[a],"readwrite",function(c){return ah(c,a).get(b)})};
function dh(a,b){return $g(a,["databases"],"readwrite",function(c){c=ah(c,"databases");return X(c.f.put(b,void 0))})}
function $g(a,b,c,d){c=void 0===c?"readonly":c;return new M(function(e,f){var g=a.f.transaction(b,c),h=new eh(g);Ng(d(h).then(function(k){Kd(fh(h).then(function(){e(k)}),function(l){f(l)})}),function(k){f(k)})})}
function ch(a){this.f=a}
p=ch.prototype;p.add=function(a,b){return X(this.f.add(a,b))};
p.clear=function(){return X(this.f.clear()).then(function(){})};
p.count=function(a){return X(this.f.count(a))};
p["delete"]=function(a){return X(this.f["delete"](a))};
p.get=function(a){return X(this.f.get(a))};
p.index=function(a){return new gh(this.f.index(a))};
p.getName=function(){return this.f.name};
function eh(a){var b=this;this.f=a;this.g=new Map;this.aborted=!1;this.done=new M(function(c,d){b.f.addEventListener("complete",function(){c()});
b.f.addEventListener("error",function(e){e.currentTarget===e.target&&d(b.f.error)});
b.f.addEventListener("abort",function(){var e=b.f.error;e?("QuotaExceededError"===e.name?se(new Tg):"UnknownError"===e.name&&se(new Ug),d(e)):d(new Rg)})})}
eh.prototype.abort=function(){this.f.abort();this.aborted=!0};
function fh(a){var b=a.f;b.commit&&!a.aborted&&b.commit();return a.done}
function ah(a,b){var c=a.f.objectStore(b),d=a.g.get(c);d||(d=new ch(c),a.g.set(c,d));return d}
function gh(a){this.f=a}
gh.prototype.count=function(a){return X(this.f.count(a))};
gh.prototype.get=function(a){return X(this.f.get(a))};
function hh(a,b,c){a=a.f.openCursor(void 0===b.query?null:b.query,void 0===b.direction?"next":b.direction);return ih(a).then(function(d){return Wg(d,c)})}
function jh(a,b){this.request=a;this.f=b}
function ih(a){return X(a).then(function(b){return null===b?null:new jh(a,b)})}
jh.prototype["delete"]=function(){return X(this.f["delete"]()).then(function(){})};
jh.prototype.update=function(a){return X(this.f.update(a))};function kh(a,b,c){function d(){n||(n=new Zg(f.result,{closed:m}));return n}
var e=eh,f=self.indexedDB.open(a,b),g=c.blocked,h=c.blocking,k=c.Pa,l=c.upgrade,m=c.closed,n;l&&f.addEventListener("upgradeneeded",function(r){if(null===r.newVersion)throw Error("Invariant: newVersion on IDbVersionChangeEvent is null");if(null===f.transaction)throw Error("Invariant: transaction on IDbOpenDbRequest is null");var q=d(),v=new e(f.transaction);l(q,r.oldVersion,r.newVersion,v)});
g&&f.addEventListener("blocked",function(){g()});
return Yg(f).then(function(r){h&&r.addEventListener("versionchange",function(){h(d())});
k&&r.addEventListener("close",function(){k()});
return d()})}
function lh(a,b,c){c=void 0===c?{}:c;return kh(a,b,c)}
;var mh,nh,oh=["getAll","getAllKeys","getKey","openKeyCursor"],ph=["getAll","getAllKeys","getKey","openKeyCursor"];function qh(){return G(this,function b(){var c,d;return z(b,function(e){switch(e.f){case 1:if(Ig&&Jg()&&!Kg()&&!T("ytidb_allow_on_ios_safari_v8_and_v9")||Fb)return e["return"](!1);try{if(c=self,!(c.indexedDB&&c.IDBIndex&&c.IDBKeyRange&&c.IDBObjectStore))return e["return"](!1)}catch(f){return e["return"](!1)}va(e);return y(e,Kd(lh("yt-idb-test-do-not-use"),function(){}),5);
case 5:if(d=e.g,!d)return e["return"](!1);case 3:xa(e);if(d)try{d.close()}catch(f){}ya(e);break;case 2:return wa(e),e["return"](!1);case 4:return e["return"](!0)}})})}
function rh(){return void 0!==mh?Hd(mh):new M(function(a){qh().then(function(b){mh=b;a(b)})})}
function sh(){return void 0!==nh?Hd(nh):rh().then(function(a){if(!a)return!1;var b=u(oh);for(a=b.next();!a.done;a=b.next())if(!IDBObjectStore.prototype[a.value])return!1;b=u(ph);for(a=b.next();!a.done;a=b.next())if(!IDBIndex.prototype[a.value])return!1;return IDBObjectStore.prototype.getKey?!0:!1}).then(function(a){return nh=a})}
;var th;function uh(){function a(b){b.close();th=void 0}
th||(th=Kd(lh("YtIdbMeta",1,{blocking:a,upgrade:function(b,c){1>c&&bh(b,"databases",{keyPath:"actualName"})}}),function(b){return Vg(b)?lh("YtIdbMeta",void 0,{blocking:a}):Id(b)}));
return th}
function vh(a){return uh().then(function(b){return b.get("databases",a.actualName).then(function(c){if(c?a.actualName!==c.actualName||a.publicName!==c.publicName||a.userIdentifier!==c.userIdentifier||a.signedIn!==c.signedIn:1)return dh(b,a)})})}
function wh(a){return uh().then(function(b){return b["delete"]("databases",a)})}
;function xh(a){try{var b={actualName:"LogsDataBase",publicName:"LogsDataBase",userIdentifier:void 0,signedIn:!1}}catch(c){return Id(c)}return Kd(vh(b).then(function(){return a(b)}),function(c){return Kd(wh(b.actualName),function(){}).then(function(){return Id(c)})})}
function yh(){return rh().then(function(a){if(!a)throw new Sg;})}
function zh(a,b){b=void 0===b?{}:b;return yh().then(function(){return xh(function(c){return lh(c.actualName,a,b)})})}
;function Ah(){V.call(this,function(){});
throw Error("Not allowed to instantiate the thennable outside of the core library.");}
x(Ah,V);Ah.reject=V.reject;Ah.resolve=V.resolve;Ah.all=V.all;var Bh;function Ch(){return G(this,function b(){return z(b,function(c){if(!Bh)try{Bh=zh(1,{upgrade:function(d,e){1>e&&(bh(d,"LogsRequestsStore",{keyPath:"id",autoIncrement:!0}).f.createIndex("newRequest",["status","authHash","timestamp"],{unique:!1}),bh(d,"sapisid"))},
blocking:function(d){d.close();Bh=void 0}})}catch(d){if(!Vg(d))return re(d),c["return"](Promise.reject(d));
Bh=zh()}return c["return"](Bh)})})}
function Dh(a){return G(this,function c(){var d,e,f;return z(c,function(g){if(1==g.f)return y(g,Eh(),2);if(3!=g.f)return d=g.g,y(g,Ch(),3);e=g.g;f=Object.assign(Object.assign({},a),{options:JSON.parse(JSON.stringify(a.options)),authHash:d});return g["return"](e.add("LogsRequestsStore",f))})})}
function Fh(){return G(this,function b(){var c,d,e,f,g,h;return z(b,function(k){switch(k.f){case 1:return y(k,Eh(),2);case 2:return c=k.g,d=["NEW",c,0],e=["NEW",c,U()],f=IDBKeyRange.bound(d,e),y(k,Ch(),3);case 3:return g=k.g,h=void 0,y(k,$g(g,["LogsRequestsStore"],"readwrite",function(l){return hh(ah(l,"LogsRequestsStore").index("newRequest"),{query:f,direction:"prev"},function(m){m.f.value&&(h=m.f.value,h.status="QUEUED",m.update(h))})}),4);
case 4:return k["return"](h)}})})}
function Gh(a){return G(this,function c(){var d;return z(c,function(e){if(1==e.f)return y(e,Ch(),2);d=e.g;return e["return"]($g(d,["LogsRequestsStore"],"readwrite",function(f){var g=ah(f,"LogsRequestsStore");return g.get(a).then(function(h){if(h)return h.status="QUEUED",X(g.f.put(h,void 0)).then(function(){return h})})}))})})}
function Hh(a){return G(this,function c(){var d;return z(c,function(e){if(1==e.f)return y(e,Ch(),2);d=e.g;return e["return"]($g(d,["LogsRequestsStore"],"readwrite",function(f){var g=ah(f,"LogsRequestsStore");return g.get(a).then(function(h){return h?(h.status="NEW",h.sendCount+=1,X(g.f.put(h,void 0)).then(function(){return h})):Ah.resolve(void 0)})}))})})}
function Ih(a){return G(this,function c(){var d;return z(c,function(e){if(1==e.f)return y(e,Ch(),2);d=e.g;return e["return"](d["delete"]("LogsRequestsStore",a))})})}
function Eh(){return G(this,function b(){var c;return z(b,function(d){if(1==d.f){Hg.f||(Hg.f=new Hg);var e={};var f=Gc([]);f&&(e.Authorization=f,e["X-Goog-AuthUser"]=P("SESSION_INDEX",0),"INNERTUBE_HOST_OVERRIDE"in me||(e["X-Origin"]=window.location.origin),T("pageid_as_header_web")&&"DELEGATED_SESSION_ID"in me&&(e["X-Goog-PageId"]=P("DELEGATED_SESSION_ID")));e=Hd(e);return y(d,e,2)}c=d.g;return d["return"](Ag(c))})})}
;var Jh=Se("network_polling_interval",3E4);function Kh(){this.i=0;this.f=Lh();Mh(this);Nh(this)}
function Oh(){Kh.f||(Kh.f=new Kh);return Kh.f}
function Ph(a){a.f!==Lh()&&re(Error("NetworkStatusManager isOnline does not match window status"));return a.f}
function Qh(a){var b=Rh,c=Sh;(new M(function(d){a.g=d})).then(function(){b();
c&&(a.h=c)});
Th(a)}
function Lh(){var a=window.navigator.onLine;return void 0===a?!0:a}
function Nh(a){window.addEventListener("online",function(){a.f=!0;a.g&&a.g()})}
function Mh(a){window.addEventListener("offline",function(){a.f=!1;a.h&&a.h()})}
function Th(a){a.i||(Uh(a),Lh()&&a.g&&a.g())}
function Uh(a){a.i=Ue(function(){Lh()?(!1===a.f&&re(Error("NetworkStatusManager missed online event.")),a.f=!0,a.g&&a.g()):(!0===a.f&&re(Error("NetworkStatusManager missed offline event.")),a.f=!1,a.h&&a.h());Uh(a)},Jh)}
;var Vh=Se("networkless_throttle_timeout")||100,Wh=Se("networkless_retry_attempts")||1,Xh=0;function Yh(a,b){b=void 0===b?{}:b;Zh().then(function(c){var d=Ph(Oh());if(!c||T("networkless_bypass_write")||d&&T("vss_networkless_bypass_write"))qg(a,b);else{var e={url:a,options:b,timestamp:U(),status:"NEW",sendCount:0};Dh(e).then(function(f){e.id=f;f=Oh();Ph(f)&&!T("networkless_always_offline")?$h(e):Qh(f)})["catch"](function(f){$h(e);
re(f)})}})}
function Rh(){var a=this;Xh||(Xh=Ve(function(){return G(a,function c(){var d;return z(c,function(e){if(1==e.f)return y(e,Fh(),2);if(3!=e.f)return d=e.g,d?y(e,$h(d),3):(Sh(),e["return"]());Xh=0;Rh();e.f=0})})},1,Vh))}
function Sh(){var a=Xh;if(!isNaN(a)){var b=C("yt.scheduler.instance.cancelJob");b?b(a):window.clearTimeout(a)}Xh=0}
function $h(a){return G(this,function c(){var d;return z(c,function(e){switch(e.f){case 1:if(!a.id){e.B(2);break}return y(e,Gh(a.id),3);case 3:(d=e.g)?a=d:se(Error("The request cannot be found in the database."));case 2:var f=a.timestamp;if(!(2592E6<=U()-f)){e.B(4);break}se(Error("Networkless Logging: Stored logs request expired age limit"));if(!a.id){e.B(5);break}return y(e,Ih(a.id),5);case 5:return e["return"]();case 4:f=a=ai(a);var g,h;if(null===(h=null===(g=null===f||void 0===f?void 0:f.options)||
void 0===g?void 0:g.u)||void 0===h?0:h.requestTimeMs)f.options.u.requestTimeMs=Math.round(U());(a=f)&&qg(a.url,a.options);e.f=0}})})}
function ai(a){var b=this,c=a.options.onError?a.options.onError:function(){};
a.options.onError=function(e,f){return G(b,function h(){return z(h,function(k){if(1==k.f)return a&&a.id?a.sendCount<Wh?y(k,Hh(a.id),6):y(k,Ih(a.id),2):k.B(2);2!=k.f&&Qh(Oh());c(e,f);k.f=0})})};
var d=a.options.onSuccess?a.options.onSuccess:function(){};
a.options.onSuccess=function(e,f){return G(b,function h(){return z(h,function(k){if(1==k.f)return a&&a.id?y(k,Ih(a.id),2):k.B(2);d(e,f);k.f=0})})};
return a}
function Zh(){return G(this,function b(){return z(b,function(c){return T("networkless_logging")?(2===Se("networkless_ytidb_version")&&sh().then(function(d){return d}),c["return"](rh())):c["return"](!1)})})}
;function bi(a,b){for(var c=[],d=1;d<arguments.length;++d)c[d-1]=arguments[d];d=Error.call(this,a);this.message=d.message;"stack"in d&&(this.stack=d.stack);this.args=[].concat(c instanceof Array?c:ia(u(c)))}
x(bi,Error);function ci(a){var b=this;this.f=null;a?this.f=a:xg()&&(this.f=Yf());Ue(function(){Gg(b)},5E3)}
ci.prototype.isReady=function(){!this.f&&xg()&&(this.f=Yf());return!!this.f};
function ag(a,b,c,d){!P("VISITOR_DATA")&&"visitor_id"!==b&&.01>Math.random()&&se(new bi("Missing VISITOR_DATA when sending innertube request.",b,c,d));if(!a.isReady()){var e=new bi("innertube xhrclient not ready",b,c,d);re(e);e.sampleWeight=0;throw e;}var f={headers:{"Content-Type":"application/json"},method:"POST",u:c,aa:"JSON",I:function(){d.I()},
Y:d.I,onSuccess:function(n,r){if(d.onSuccess)d.onSuccess(r)},
X:function(n){if(d.onSuccess)d.onSuccess(n)},
onError:function(n,r){if(d.onError)d.onError(r)},
Na:function(n){if(d.onError)d.onError(n)},
timeout:d.timeout,withCredentials:!0},g="";(e=a.f.na)&&(g=e);var h=a.f.pa||!1,k=yg(h,g,d);Object.assign(f.headers,k);f.headers.Authorization&&!g&&(f.headers["x-origin"]=window.location.origin);e="/youtubei/"+a.f.innertubeApiVersion+"/"+b;var l={alt:"json"};a.f.oa&&f.headers.Authorization||(l.key=a.f.innertubeApiKey);var m=Fe(""+g+e,l||{},!0);Zh().then(function(n){if(d.retry&&T("retry_web_logging_batches")&&"www.youtube-nocookie.com"!=g){if(T("networkless_gel")&&!n||!T("networkless_gel"))var r=Eg(b,
c,k,h);if(r){var q=f.onSuccess,v=f.X;f.onSuccess=function(w,F){Fg(r);q(w,F)};
c.X=function(w,F){Fg(r);v(w,F)}}}try{T("use_fetch_for_op_xhr")?ng(m,f):T("networkless_gel")&&d.retry?(f.method="POST",Yh(m,f)):(f.method="POST",f.u||(f.u={}),qg(m,f))}catch(w){if("InvalidAccessError"==w.name)r&&(Fg(r),r=0),se(Error("An extension is blocking network request."));
else throw w;}r&&Ue(function(){Gg(a)},5E3)})}
;var di=[{W:function(a){return"Cannot read property '"+a.key+"'"},
R:{TypeError:[{regexp:/Cannot read property '([^']+)' of (null|undefined)/,groups:["key","value"]},{regexp:/\u65e0\u6cd5\u83b7\u53d6\u672a\u5b9a\u4e49\u6216 (null|undefined) \u5f15\u7528\u7684\u5c5e\u6027\u201c([^\u201d]+)\u201d/,groups:["value","key"]},{regexp:/\uc815\uc758\ub418\uc9c0 \uc54a\uc74c \ub610\ub294 (null|undefined) \ucc38\uc870\uc778 '([^']+)' \uc18d\uc131\uc744 \uac00\uc838\uc62c \uc218 \uc5c6\uc2b5\ub2c8\ub2e4./,groups:["value","key"]},{regexp:/No se puede obtener la propiedad '([^']+)' de referencia nula o sin definir/,
groups:["key"]},{regexp:/Unable to get property '([^']+)' of (undefined or null) reference/,groups:["key","value"]}],Error:[{regexp:/(Permission denied) to access property "([^']+)"/,groups:["reason","key"]}]}},{W:function(a){return"Cannot call '"+a.key+"'"},
R:{TypeError:[{regexp:/(?:([^ ]+)?\.)?([^ ]+) is not a function/,groups:["base","key"]},{regexp:/Object (.*) has no method '([^ ]+)'/,groups:["base","key"]},{regexp:/Object doesn't support property or method '([^ ]+)'/,groups:["key"]},{regexp:/\u30aa\u30d6\u30b8\u30a7\u30af\u30c8\u306f '([^']+)' \u30d7\u30ed\u30d1\u30c6\u30a3\u307e\u305f\u306f\u30e1\u30bd\u30c3\u30c9\u3092\u30b5\u30dd\u30fc\u30c8\u3057\u3066\u3044\u307e\u305b\u3093/,groups:["key"]},{regexp:/\uac1c\uccb4\uac00 '([^']+)' \uc18d\uc131\uc774\ub098 \uba54\uc11c\ub4dc\ub97c \uc9c0\uc6d0\ud558\uc9c0 \uc54a\uc2b5\ub2c8\ub2e4./,
groups:["key"]}]}}];function ei(){this.f=[];this.g=[]}
var fi;var gi=new N;var hi=new Set,ii=0,ji=["PhantomJS","Googlebot","TO STOP THIS SECURITY SCAN go/scan"];function ki(a,b,c,d){c+="."+a;a=String(JSON.stringify(b)).substr(0,500);d[c]=a;return c.length+a.length}
;function Y(a,b,c){this.l=this.f=this.g=null;this.j=Ra(this);this.h=0;this.s=!1;this.m=[];this.i=null;this.v=c;this.G={};c=document;if(a="string"===typeof a?c.getElementById(a):a)if(c="iframe"==a.tagName.toLowerCase(),b.host||(b.host=c?oc(a.src):"https://www.youtube.com"),this.g=new Oe(b),c||(b=li(this,a),this.l=a,(c=a.parentNode)&&c.replaceChild(b,a),a=b),this.f=a,this.f.id||(this.f.id="widget"+Ra(this.f)),Ie[this.f.id]=this,window.postMessage){this.i=new N;mi(this);b=S(this.g,"events");for(var d in b)b.hasOwnProperty(d)&&
this.addEventListener(d,b[d]);for(var e in Ke)ni(this,e)}}
p=Y.prototype;p.setSize=function(a,b){this.f.width=a;this.f.height=b;return this};
p.qa=function(){return this.f};
p.ba=function(a){this.K(a.event,a)};
p.addEventListener=function(a,b){var c=b;"string"==typeof b&&(c=function(){window[b].apply(window,arguments)});
if(!c)return this;this.i.subscribe(a,c);oi(this,a);return this};
function ni(a,b){var c=b.split(".");if(2==c.length){var d=c[1];a.v==c[0]&&oi(a,d)}}
p.destroy=function(){this.f.id&&(Ie[this.f.id]=null);var a=this.i;a&&"function"==typeof a.dispose&&a.dispose();if(this.l){a=this.f;var b=a.parentNode;b&&b.replaceChild(this.l,a)}else(a=this.f)&&a.parentNode&&a.parentNode.removeChild(a);Qe&&(Qe[this.j]=null);this.g=null;a=this.f;for(var c in mb)mb[c][0]==a&&ye(c);this.l=this.f=null};
p.M=function(){return{}};
function pi(a,b,c){c=c||[];c=Array.prototype.slice.call(c);b={event:"command",func:b,args:c};a.s?a.S(b):a.m.push(b)}
p.K=function(a,b){if(!this.i.h){var c={target:this,data:b};this.i.J(a,c);Ne(this.v+"."+a,c)}};
function li(a,b){for(var c=document.createElement("iframe"),d=b.attributes,e=0,f=d.length;e<f;e++){var g=d[e].value;null!=g&&""!=g&&"null"!=g&&c.setAttribute(d[e].name,g)}c.setAttribute("frameBorder",0);c.setAttribute("allowfullscreen",1);c.setAttribute("allow","accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture");c.setAttribute("title","YouTube "+S(a.g,"title"));(d=S(a.g,"width"))&&c.setAttribute("width",d);(d=S(a.g,"height"))&&c.setAttribute("height",d);var h=
a.M();h.enablejsapi=window.postMessage?1:0;window.location.host&&(h.origin=window.location.protocol+"//"+window.location.host);h.widgetid=a.j;window.location.href&&H(["debugjs","debugcss"],function(k){var l=window.location.href;var m=l.search(rc);b:{var n=0;for(var r=k.length;0<=(n=l.indexOf(k,n))&&n<m;){var q=l.charCodeAt(n-1);if(38==q||63==q)if(q=l.charCodeAt(n+r),!q||61==q||38==q||35==q)break b;n+=r+1}n=-1}if(0>n)l=null;else{r=l.indexOf("&",n);if(0>r||r>m)r=m;n+=k.length+1;l=decodeURIComponent(l.substr(n,
r-n).replace(/\+/g," "))}null!==l&&(h[k]=l)});
c.src=S(a.g,"host")+a.N()+"?"+qc(h);return c}
p.Z=function(){this.f&&this.f.contentWindow?this.S({event:"listening"}):window.clearInterval(this.h)};
function mi(a){Pe(a.g,a,a.j);a.h=Ce(Wa(a.Z,a));Ae(a.f,"load",Wa(function(){window.clearInterval(this.h);this.h=Ce(Wa(this.Z,this))},a))}
function oi(a,b){a.G[b]||(a.G[b]=!0,pi(a,"addEventListener",[b]))}
p.S=function(a){a.id=this.j;a.channel="widget";var b=Cd(a),c=this.g,d=oc(this.f.src||"");var e=0==d.indexOf("https:")?[d]:c.f?[d.replace("http:","https:")]:c.h?[d]:[d,d.replace("http:","https:")];if(this.f.contentWindow)for(var f=0;f<e.length;f++)try{this.f.contentWindow.postMessage(b,e[f])}catch(Ia){if(Ia.name&&"SyntaxError"==Ia.name){if(!(Ia.message&&0<Ia.message.indexOf("target origin ''"))){var g=void 0,h=void 0,k=Ia;h=void 0===h?{}:h;h.name=P("INNERTUBE_CONTEXT_CLIENT_NAME",1);h.version=P("INNERTUBE_CONTEXT_CLIENT_VERSION",
void 0);var l=h||{},m="WARNING";m=void 0===m?"ERROR":m;g=void 0===g?!1:g;if(k){if(T("console_log_js_exceptions")){var n=k,r=[];r.push("Name: "+n.name);r.push("Message: "+n.message);n.hasOwnProperty("params")&&r.push("Error Params: "+JSON.stringify(n.params));r.push("File name: "+n.fileName);r.push("Stacktrace: "+n.stack);window.console.log(r.join("\n"),n)}if((window&&window.yterr||g)&&!(5<=ii)&&0!==k.sampleWeight){var q=void 0,v=k,w=l,F=cc(v),Qa=F.message||"Unknown Error",ma=F.name||"UnknownError",
Da=F.lineNumber||"Not available",vi=F.fileName||"Not available",wi=F.stack||v.f||"Not available";if(v.hasOwnProperty("args")&&v.args&&v.args.length)for(var ra=0,Mb=0;Mb<v.args.length;Mb++){var R=v.args[Mb],Aa="params."+Mb;ra+=Aa.length;if(R)if(Array.isArray(R)){for(var xi=w,cd=ra,cb=0;cb<R.length&&!(R[cb]&&(cd+=ki(cb,R[cb],Aa,xi),500<cd));cb++);ra=cd}else if("object"===typeof R){var Nb=void 0,yi=w,dd=ra;for(Nb in R)if(R[Nb]&&(dd+=ki(Nb,R[Nb],Aa,yi),500<dd))break;ra=dd}else w[Aa]=String(JSON.stringify(R)).substring(0,
500),ra+=w[Aa].length;else w[Aa]=String(JSON.stringify(R)).substring(0,500),ra+=w[Aa].length;if(500<=ra)break}else if(v.hasOwnProperty("params")&&v.params){var Ob=v.params;if("object"===typeof v.params){var kf=0;for(q in Ob)if(Ob[q]){var lf="params."+q,mf=String(JSON.stringify(Ob[q])).substr(0,500);w[lf]=mf;kf+=lf.length+mf.length;if(500<kf)break}}else w.params=String(JSON.stringify(Ob)).substr(0,500)}navigator.vendor&&!w.hasOwnProperty("vendor")&&(w.vendor=navigator.vendor);var ed={message:Qa,name:ma,
lineNumber:Da,fileName:vi,stack:wi,params:w},nf=Number(v.columnNumber);isNaN(nf)||(ed.lineNumber=ed.lineNumber+":"+nf);for(var fa,Ba=ed,of=u(di),fd=of.next();!fd.done;fd=of.next()){var gd=fd.value;if(gd.R[Ba.name])for(var pf=u(gd.R[Ba.name]),hd=pf.next();!hd.done;hd=pf.next()){var qf=hd.value,Pb=Ba.message.match(qf.regexp);if(Pb){Ba.params["error.original"]=Pb[0];for(var id=qf.groups,rf={},Ja=0;Ja<id.length;Ja++)rf[id[Ja]]=Pb[Ja+1],Ba.params["error."+id[Ja]]=Pb[Ja+1];Ba.message=gd.W(rf);break}}}fa=
Ba;window.yterr&&"function"===typeof window.yterr&&window.yterr(fa);if(!(hi.has(fa.message)||0<=fa.stack.indexOf("/YouTubeCenter.js")||0<=fa.stack.indexOf("/mytube.js"))){gi.J("handleError",fa);if(T("kevlar_gel_error_routing")){var Qb=void 0,sf=m,O=fa;a:{for(var tf=u(ji),jd=tf.next();!jd.done;jd=tf.next()){var uf=I;if(uf&&0<=uf.toLowerCase().indexOf(jd.value.toLowerCase())){var vf=!0;break a}}vf=!1}if(!vf){var db={stackTrace:O.stack};O.fileName&&(db.filename=O.fileName);var ha=O.lineNumber&&O.lineNumber.split?
O.lineNumber.split(":"):[];0!==ha.length&&(1!==ha.length||isNaN(Number(ha[0]))?2!==ha.length||isNaN(Number(ha[0]))||isNaN(Number(ha[1]))||(db.lineNumber=Number(ha[0]),db.columnNumber=Number(ha[1])):db.lineNumber=Number(ha[0]));var zi=O.message,Ai=O.name;fi||(fi=new ei);var wf=fi;a:{for(var xf=u(wf.g),kd=xf.next();!kd.done;kd=xf.next()){var yf=kd.value;if(O.message&&O.message.match(yf.f)){var ld=yf.weight;break a}}for(var zf=u(wf.f),md=zf.next();!md.done;md=zf.next()){var Af=md.value;if(Af.f(O)){ld=
Af.weight;break a}}ld=1}var nd={level:"ERROR_LEVEL_UNKNOWN",message:zi,errorClassName:Ai,sampleWeight:ld};"ERROR"===sf?nd.level="ERROR_LEVEL_ERROR":"WARNING"===sf&&(nd.level="ERROR_LEVEL_WARNNING");var Bi={isObfuscated:!0,browserStackInfo:db},Rb={pageUrl:window.location.href,kvPairs:[]},od=O.params;if(od)for(var Bf=u(Object.keys(od)),pd=Bf.next();!pd.done;pd=Bf.next()){var Cf=pd.value;Rb.kvPairs.push({key:"client."+Cf,value:String(od[Cf])})}var Df=P("SERVER_NAME",void 0),Ef=P("SERVER_VERSION",void 0);
Df&&Ef&&(Rb.kvPairs.push({key:"server.name",value:Df}),Rb.kvPairs.push({key:"server.version",value:Ef}));var Ci={errorMetadata:Rb,stackTrace:Bi,logMessage:nd};Qb=void 0===Qb?{}:Qb;var Ff=ci;P("ytLoggingEventsDefaultDisabled",!1)&&ci==ci&&(Ff=null);var Di=Ff,W=Qb;W=void 0===W?{}:W;var eb={};eb.eventTimeMs=Math.round(W.timestamp||U());eb.clientError=Ci;var Ei=String;if(W.timestamp)var Gf=-1;else{var Hf=C("_lact",window);Gf=null==Hf?-1:Math.max(Date.now()-Hf,0)}eb.context={lastActivityMs:Ei(Gf)};if(T("log_sequence_info_on_gel_web")&&
W.ca){var Fi=eb.context,fb=W.ca;bg[fb]=fb in bg?bg[fb]+1:0;Fi.sequence={index:bg[fb],groupKey:fb};W.Ka&&delete bg[W.ca]}var Gi=eb,Sb=W.Ja,If=Di,qd="";if(Sb){var Tb=Sb,rd={};Tb.videoId?rd.videoId=Tb.videoId:Tb.playlistId&&(rd.playlistId=Tb.playlistId);Tf[Sb.token]=rd;qd=Sb.token}var sd=Sf.get(qd)||[];Sf.set(qd,sd);sd.push(Gi);If&&(ff=new If);var Hi=Se("web_logging_max_batch")||100,Jf=U();sd.length>=Hi?Uf():10<=Jf-jf&&(Wf(),jf=Jf);Uf()}}var td,Ca=fa,gb=Ca.params||{},sa={ra:{a:"logerror",t:"jserror",
type:Ca.name,msg:Ca.message.substr(0,250),line:Ca.lineNumber,level:m,"client.name":gb.name},u:{url:P("PAGE_NAME",window.location.href),file:Ca.fileName},method:"POST"};gb.version&&(sa["client.version"]=gb.version);if(sa.u){Ca.stack&&(sa.u.stack=Ca.stack);for(var Kf=u(Object.keys(gb)),ud=Kf.next();!ud.done;ud=Kf.next()){var Lf=ud.value;sa.u["client."+Lf]=gb[Lf]}if(td=P("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS",void 0))for(var Mf=u(Object.keys(td)),vd=Mf.next();!vd.done;vd=Mf.next()){var Nf=vd.value;
sa.u[Nf]=td[Nf]}var Of=P("SERVER_NAME",void 0),Pf=P("SERVER_VERSION",void 0);Of&&Pf&&(sa.u["server.name"]=Of,sa.u["server.version"]=Pf)}qg(P("ECATCHER_REPORT_HOST","")+"/error_204",sa);hi.add(fa.message);ii++}}}}}else throw Ia;}else console&&console.warn&&console.warn("The YouTube player is not attached to the DOM. API calls should be made after the onReady event. See more: https://developers.google.com/youtube/iframe_api_reference#Events")};function qi(a){return(0===a.search("cue")||0===a.search("load"))&&"loadModule"!==a}
function ri(a){return 0===a.search("get")||0===a.search("is")}
;function Z(a,b){if(!a)throw Error("YouTube player element ID required.");var c={title:"video player",videoId:"",width:640,height:360};if(b)for(var d in b)c[d]=b[d];Y.call(this,a,c,"player");this.C={};this.playerInfo={}}
x(Z,Y);p=Z.prototype;p.N=function(){return"/embed/"+S(this.g,"videoId")};
p.M=function(){var a=S(this.g,"playerVars");if(a){var b={},c;for(c in a)b[c]=a[c];a=b}else a={};window!=window.top&&document.referrer&&(a.widget_referrer=document.referrer.substring(0,256));if(c=S(this.g,"embedConfig")){if(Pa(c))try{c=JSON.stringify(c)}catch(d){console.error("Invalid embed config JSON",d)}a.embed_config=c}return a};
p.ba=function(a){var b=a.event;a=a.info;switch(b){case "apiInfoDelivery":if(Pa(a))for(var c in a)this.C[c]=a[c];break;case "infoDelivery":si(this,a);break;case "initialDelivery":window.clearInterval(this.h);this.playerInfo={};this.C={};ti(this,a.apiInterface);si(this,a);break;default:this.K(b,a)}};
function si(a,b){if(Pa(b))for(var c in b)a.playerInfo[c]=b[c]}
function ti(a,b){H(b,function(c){this[c]||("getCurrentTime"==c?this[c]=function(){var d=this.playerInfo.currentTime;if(1==this.playerInfo.playerState){var e=(Date.now()/1E3-this.playerInfo.currentTimeLastUpdated_)*this.playerInfo.playbackRate;0<e&&(d+=Math.min(e,1))}return d}:qi(c)?this[c]=function(){this.playerInfo={};
this.C={};pi(this,c,arguments);return this}:ri(c)?this[c]=function(){var d=0;
0===c.search("get")?d=3:0===c.search("is")&&(d=2);return this.playerInfo[c.charAt(d).toLowerCase()+c.substr(d+1)]}:this[c]=function(){pi(this,c,arguments);
return this})},a)}
p.getVideoEmbedCode=function(){var a=parseInt(S(this.g,"width"),10),b=parseInt(S(this.g,"height"),10),c=S(this.g,"host")+this.N();zb.test(c)&&(-1!=c.indexOf("&")&&(c=c.replace(tb,"&amp;")),-1!=c.indexOf("<")&&(c=c.replace(ub,"&lt;")),-1!=c.indexOf(">")&&(c=c.replace(vb,"&gt;")),-1!=c.indexOf('"')&&(c=c.replace(wb,"&quot;")),-1!=c.indexOf("'")&&(c=c.replace(xb,"&#39;")),-1!=c.indexOf("\x00")&&(c=c.replace(yb,"&#0;")));return'<iframe width="'+a+'" height="'+b+'" src="'+c+'" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>'};
p.getOptions=function(a){return this.C.namespaces?a?this.C[a].options||[]:this.C.namespaces||[]:[]};
p.getOption=function(a,b){if(this.C.namespaces&&a&&b)return this.C[a][b]};
function ui(a){if("iframe"!=a.tagName.toLowerCase()){var b=Q(a,"videoid");b&&(b={videoId:b,width:Q(a,"width"),height:Q(a,"height")},new Z(a,b))}}
;function Ii(a,b){var c={title:"Thumbnail",videoId:"",width:120,height:68};if(b)for(var d in b)c[d]=b[d];Y.call(this,a,c,"thumbnail")}
x(Ii,Y);Ii.prototype.N=function(){return"/embed/"+S(this.g,"videoId")};
Ii.prototype.M=function(){return{player:0,thumb_width:S(this.g,"thumbWidth"),thumb_height:S(this.g,"thumbHeight"),thumb_align:S(this.g,"thumbAlign")}};
Ii.prototype.K=function(a,b){Y.prototype.K.call(this,a,b?b.info:void 0)};
function Ji(a){if("iframe"!=a.tagName.toLowerCase()){var b=Q(a,"videoid");if(b){b={videoId:b,events:{},width:Q(a,"width"),height:Q(a,"height"),thumbWidth:Q(a,"thumb-width"),thumbHeight:Q(a,"thumb-height"),thumbAlign:Q(a,"thumb-align")};var c=Q(a,"onclick");c&&(b.events.onClick=c);new Ii(a,b)}}}
;D("YT.PlayerState.UNSTARTED",-1);D("YT.PlayerState.ENDED",0);D("YT.PlayerState.PLAYING",1);D("YT.PlayerState.PAUSED",2);D("YT.PlayerState.BUFFERING",3);D("YT.PlayerState.CUED",5);D("YT.get",function(a){return Ie[a]});
D("YT.scan",Le);D("YT.subscribe",function(a,b,c){Wd.subscribe(a,b,c);Ke[a]=!0;for(var d in Ie)ni(Ie[d],a)});
D("YT.unsubscribe",function(a,b,c){Vd(a,b,c)});
D("YT.Player",Z);D("YT.Thumbnail",Ii);Y.prototype.destroy=Y.prototype.destroy;Y.prototype.setSize=Y.prototype.setSize;Y.prototype.getIframe=Y.prototype.qa;Y.prototype.addEventListener=Y.prototype.addEventListener;Z.prototype.getVideoEmbedCode=Z.prototype.getVideoEmbedCode;Z.prototype.getOptions=Z.prototype.getOptions;Z.prototype.getOption=Z.prototype.getOption;Je.push(function(a){a=Me("player",a);H(a,ui)});
Je.push(function(){var a=Me("thumbnail");H(a,Ji)});
"undefined"!=typeof YTConfig&&YTConfig.parsetags&&"onload"!=YTConfig.parsetags||Le();var Ki=B.onYTReady;Ki&&Ki();var Li=B.onYouTubeIframeAPIReady;Li&&Li();var Mi=B.onYouTubePlayerAPIReady;Mi&&Mi();}).call(this);
