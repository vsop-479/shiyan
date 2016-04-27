///*! login_mini - v0.1.0 - 2014-04-16 */
////验证账户是否异常代码，跟登录没有任何关系。。看登录源码忽略此部分。start
//function detectMacXFF() {
//    var userAgent = navigator.userAgent.toLowerCase();
//    if(userAgent.indexOf("mac") != -1 && userAgent.indexOf("firefox") != -1) {
//        return true;
//    }
//}
//var href = window.location.href.split('.');
//var hostName = href[href.length-2];
//if(hostName !='focustest'){
//    hostName = 'focus';
//}
//$.cookie = function(name, value, options) {
//    if (typeof value != 'undefined') { // name and value given, set cookie
//        options = options || {};
//        if (value === null) {
//            value = '';
//            options.expires = -1;
//        }
//        var expires = '';
//        if (options.expires && (typeof options.expires == 'number' || options.expires.toUTCString)) {
//            var date;
//            if (typeof options.expires == 'number') {
//                date = new Date();
//                date.setTime(date.getTime() + (options.expires * 24 * 60 * 60 * 1000));
//            } else {
//                date = options.expires;
//            }
//            expires = '; expires=' + date.toUTCString(); // use expires attribute, max-age is not supported by IE
//        }
//        var path = options.path ? '; path=' + options.path : '';
//        var domain = options.domain ? '; domain=' + options.domain : '';
//        var secure = options.secure ? '; secure' : '';
//        document.cookie = [name, '=', encodeURIComponent(value), expires, path, domain, secure].join('');
//    } else { // only name given, get cookie
//        var cookieValue = null;
//        if (document.cookie && document.cookie != '') {
//            var cookies = document.cookie.split(';');
//            for (var i = 0; i < cookies.length; i++) {
//                var cookie = jQuery.trim(cookies[i]);
//                // Does this cookie string begin with the name we want?
//                if (cookie.substring(0, name.length + 1) == (name + '=')) {
//                    cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
//                    break;
//                }
//            }
//        }
//        return cookieValue;
//    }
//};
//
//
//function in_array(needle, haystack) {
//    if(typeof needle == "string" || typeof needle == "number") {
//        for(var i in haystack) {
//            if(haystack[i] == needle) {
//                return true;
//            }
//        }
//    }
//    return false;
//}
//
//function sd_load(sd_width) {
//    if(sd_width) {
//        $("#SD_window").css("width", sd_width + "px");
//    }
//    var sd_top = ($(window).height() - $("#SD_window").height()) / 2 + $(document).scrollTop();
//    if(sd_top < 0) {
//        sd_top = 0;
//    }
//    var sd_left = ($(window).width() - $("#SD_window").width()) / 2;
//    if(sd_left < 0) {
//        sd_left = 0;
//    }
//    $("#SD_window").css("top", sd_top);
//    $("#SD_window").css("left", sd_left);
//}
//
//function sd_remove() {
//    $(".SD_close,#SD_cancel,#SD_confirm").unbind("click");
//    $("#SD_window,#SD_overlay,#SD_HideSelect").remove();
//    if(typeof document.body.style.maxHeight == "undefined") {
//        $("body","html").css({height: "auto", width: "auto"});
//    }
//}
//
//function showDialog(mode, msg, t, sd_width) {
//    var sd_width = sd_width ? sd_width : 400;
//    var mode = in_array(mode, ['confirm', 'window', 'info', 'loading']) ? mode : 'alert';
//    var t = t ? t : "";
//    var msg = msg ? msg : "";
//    var confirmtxt = confirmtxt ? confirmtxt : "确定";
//    var canceltxt = canceltxt ? canceltxt : "取消";
//    sd_remove();
//    try {
//        if(typeof document.body.style.maxHeight === "undefined") {
//            $("body","html").css({height: "100%", width: "100%"});
//            if(document.getElementById("SD_HideSelect") === null) {
//                $("body").append("<iframe id='SD_HideSelect'></iframe><div id='SD_overlay'></div>");
//            }
//        } else {
//            if(document.getElementById("SD_overlay") === null) {
//                $("body").append("<div id='SD_overlay'></div>");
//            }
//        }
//        if(mode == "alert") {
//            if(detectMacXFF()) {
//                $("#SD_overlay").addClass("SD_overlayMacFFBGHack");
//            } else {
//                $("#SD_overlay").addClass("SD_overlayBG");
//            }
//        } else {
//            if (detectMacXFF()) {
//                $("#SD_overlay").addClass("SD_overlayMacFFBGHack2");
//            } else {
//                $("#SD_overlay").addClass("SD_overlayBG2");
//            }
//        }
//        $("body").append("<div id='SD_window'></div>");
//        var SD_html;
//        SD_html = "";
//        SD_html += "<table cellspacing='0' cellpadding='0'><tbody><tr><td class='SD_bg'></td><td class='SD_bg'></td><td class='SD_bg'></td></tr>";
//        SD_html += "<tr><td class='SD_bg'></td>";
//        SD_html += "<td id='SD_container'>";
//        SD_html += "<h3 id='SD_title'>" + t + "</h3>";
//        SD_html += "<div id='SD_body'><div id='SD_content'>" + msg + "</div></div>";
//        SD_html += "<div id='SD_button'><div class='SD_button'>";
//        SD_html += "<a id='SD_confirm'>" + confirmtxt + "</a>";
//        SD_html += "<a id='SD_cancel'>" + canceltxt + "</a>";
//        SD_html += "</div></div>";
//        SD_html += "<a href='javascript:;' class='SD_close' title='关闭'></a>";
//        SD_html += "</td>";
//        SD_html += "<td class='SD_bg'></td></tr>";
//        SD_html += "<tr><td class='SD_bg'></td><td class='SD_bg'></td><td class='SD_bg'></td></tr></tbody></table>";
//        $("#SD_window").append(SD_html);
//        $("#SD_confirm,#SD_cancel,.SD_close").bind("click", function(){
//            sd_remove();
//        });
//        if(mode == "info" || mode == "alert") {
//            $("#SD_cancel").hide();
//            $("#SD_button").show();
//        }
//        if(mode == "window") {
//            $(".SD_close").show();
//        }
//        if(mode == "confirm") {
//            $("#SD_button").show();
//        }
//        $("#SD_body").width(sd_width - 50);
//        sd_load(sd_width);
//        $("#SD_window").show();
//        $("#SD_window").focus();
//    } catch(e) {
//        alert("System Error !");
//    }
//};
//
////检验账号是否异常
//var verifyAccountException = function(data) {
//    if (data.errorCode == 1) {
//        showDialog('window', '<div class="abnormalact">\
//            <i></i><p>系统检测到您的账号存在异常，为保护您的账号安全，请重置密码！</p>\
//        </div><div class="firstreset">\
//            <h3>方法一</h3>\
//            <div>\
//                <p>编辑新密码&nbsp;(3-16位字母、数字、符号)，</p>\
//                <p>移动用户发送短信到<em>1065712079173901</em></p>\
//                <p>联通用户发送短信到<em>10690361131021</em></p>\
//                <p>电信用户发送短信到<em>10690361131021</em></p>\
//            </div>\
//        </div><div class="secondreset">\
//            <h3>方法二</h3>\
//            <p>邮箱注册的用户请点击<a href="http://passport.sohu.com/security/manage_password">http://passport.sohu.com/security/manage_password</a>重置密码。</p>\
//        </div>', '', 415);
//    }
//};
//$(function(){
//    try {
//        if (!appId && !secretKey) {
//            return false;
//        }
//        $('<script src="http://i.'+hostName+'.cn/reminduser/need?appId=' + appId + '&secretKey=' + secretKey + '&callback=verifyAccountException"></script>').appendTo('body');
//    } catch(e) {
//    } finally {
//    }
//});
//
////验证账户是否异常代码，跟登录没有关系。看登录源码忽略此部分。end
////跨二级子域名请求插件。跟登录逻辑没有关系。<start>
//(function ($) {
//
//    'use strict';
//
//    document.domain = hostName+'.cn';
//
//    function splitUntil(result, url, target, remainFirst) {
//        var min = url.length;
//        for(var i=0, len = url.length; i < len; i++) {
//            if (target.indexOf(url.charAt(i)) != -1) {
//                if (i < min) {
//                    min = i;
//                    break;
//                }
//            }
//        }
//        result.got = url.substring(0, min);
//        result.remained = (remainFirst? url.substring(min) : url.substring(min + 1));
//        return result;
//    }
//
//    var urllib = {
//        // 解析一个url为 scheme / netloc / path / params / query / fragment 六个部分
//        // @see http://docs.python.org/library/urlparse.html
//        parse: function (url, default_scheme) {
//            if (typeof url != 'string') {
//                return ['', '', '', '', '', ''];
//            }
//            var scheme = '', netloc='', path = '', params = '', query = '', fragment = '', i = 0;
//            i = url.indexOf(':');
//            if (i > 0) {
//                if (url.substring(0, i) == 'http') {
//                    scheme = url.substring(0, i).toLowerCase();
//                    url = url.substring(i+1);
//                } else {
//                    for (i = 0, len = url.length; i < len; i++) {
//                        if (scheme_chars.indexOf(url.charAt(i)) == -1) {
//                            break;
//                        }
//                    }
//                    scheme = url.substring(0, i);
//                    url = url.substring(i + 1);
//                }
//            }
//            if (!scheme && default_scheme) {
//                scheme = default_scheme;
//            }
//            var splited = {};
//            if (url.substring(0, 2) == '//') {
//                splitUntil(splited, url.substring(2), '/?#', true);
//                netloc = splited.got;
//                url = splited.remained;
//            }
//
//            if (url.indexOf('#') != -1) {
//                splitUntil(splited, url, '#');
//                url = splited.got;
//                fragment = splited.remained;
//            }
//            if (url.indexOf('?') != -1) {
//                splitUntil(splited, url, '?');
//                url = splited.got;
//                query = splited.remained;
//            }
//            if (url.indexOf(';') != -1) {
//                splitUntil(splited, url, ';');
//                path = splited.got;
//                params = splited.remained;
//            }
//
//            if (!path) {
//                path = url;
//            }
//            return [scheme, netloc, path, params, query, fragment];
//        },
//        // parse 的反操作。
//        unparse: function (parts) {
//            if (!parts) {
//                return '';
//            }
//            var url = '';
//            if (parts[0]) url += parts[0] + '://' + parts[1];
//            if (parts[1] && parts[2] && parts[2].indexOf('/') != 0) url += '/';
//            url += parts[2];
//            if (parts[3]) url += ';' + parts[3];
//            if (parts[4]) url += '?' + parts[4];
//            if (parts[5]) url += '#' + parts[5];
//
//            return url;
//        },
//        //
//        // 合并两段url
//        //
//        // 合并规则：
//        // 以url为基础，分为scheme、netloc、path、params、query和fragment六个部分，
//        // 如果前N个部分完全不存在，取base的相关部分，返回base的前N个部分+url的后6-N个部分
//        // 如果path和params部分有一个存在，取base的path上一层目录为父目录，返回base的path之前的部分+新path+url的path之后6的部分
//        // +操作为urlunparse
//        //
//        // @see unparse
//        //
//        join: function (base, url) {
//            // 逻辑完全照抄python的urlparse.py
//
//            if (!base) {
//                return url;
//            }
//
//            if (!url) {
//                return base;
//            }
//
//            url = String(url);
//            base = String(base);
//
//            var bparts = this.parse(base);
//            var parts = this.parse(url, bparts[0]);
//
//            // scheme
//            if (parts[0] != bparts[0]) {
//                return url;
//            }
//
//            // netloc
//            if (parts[1]) {
//                return this.unparse(parts);
//            }
//
//            parts[1] = bparts[1];
//
//            // path
//            if (parts[2].charAt(0) == '/') {
//                return this.unparse(parts);
//            }
//
//            // params
//            if (!parts[2] && !parts[3]) {
//                parts[2] = bparts[2];
//                parts[3] = bparts[3];
//                if (!parts[4]) {
//                    parts[4] = bparts[4];
//                }
//                return this.unparse(parts);
//            }
//
//            var segments = bparts[2].split('/').slice(0, -1).concat(parts[2].split('/'));
//            var i;
//
//            // 确保能够生成最后的斜线
//            if (segments[segments.length - 1] == '.') {
//                segments[segments.length - 1] = '';
//            }
//
//            // 去掉所有'.'当前目录
//            for (i = 0, l = segments.length; i < l; i++) {
//                if (segments[i] == '.') {
//                    segments.splice(i, 1);
//                    i--;
//                }
//            }
//
//            // 合并所有'..'
//            while (true) {
//                i = 1;
//                n = segments.length - 1;
//                while (i < n) {
//                    if (segments[i] == '..' && ['', '..'].indexOf(segments[i - 1]) == -1) {
//                        segments.splice(i - 1, 2);
//                        break;
//                    }
//                    i++;
//                }
//                if (i >= n) {
//                    break;
//                }
//            }
//
//            if (segments.length == 2 && segments[0] == '' && segments[1] == '..') {
//                segments[segments.length - 1] = '';
//            }
//            else if (segments.length >= 2 && segments[segments.length - 1] == '..') {
//                segments.pop();
//                segments.pop();
//                segments.push('');
//            }
//
//            parts[2] = segments.join('/');
//
//            return this.unparse(parts);
//        }
//    };
//
//    var corsxhrs = {},
//    //jqXHR,
//        corssend = function (iframe, options, complete) {
//            var s = $.extend({}, options);
//
//            try {
//                var corsxhr = iframe.contentWindow.getTransport();
//            }
//            catch (e) {
//                return complete(-1, e);
//            }
//
//            s.complete = null;
//            s.success = null;
//            s.error = null;
//            s.crossDomain = false;
//            s.xhr = function () { return corsxhr; };
//            s.xhr.cors = true;
//
//            return $.ajax(s).always(function (responses, statusText, xhr) {
//                try {
//                    complete(xhr.status, statusText, {text: xhr.responseText}, xhr.getAllResponseHeaders());
//                }
//                catch (e) {
//                    complete(-1, e);
//                }
//                finally {
//                    //jqXHR = null;
//                    var parts = urllib.parse(s.url);
//                    var tag = parts[1].split('.')[0];
//                    corsxhr = null;
//                    if (tag !== 'wpi') {
//                        corsxhrs[tag].counter -= 1;
//                        if (corsxhrs[tag].counter === 0) {
//                            delete corsxhrs[tag];
//                            setTimeout(function () {
//                                $(iframe).attr('src', 'javascript:;').remove();
//                            }, 1000);
//                        }
//                    }
//                }
//            });
//
//        },
//        transport = function (options, originalOptions, originalJQXHR) {
//            if (options.url.charAt(0) === '/') {
//                options.url = 'http://' + window.location.hostname + options.url;
//            }
//            var parts = urllib.parse(options.url), tag = parts[1].split('.')[0];
//            var jqXHR;
//
//            if (window.location.hostname !== parts[1] && !options.xhr.cors) {
//                return {
//                    send: function (headers, complete) {
//                        if ($.isArray(corsxhrs[tag])) {
//                            corsxhrs[tag].push({originalOptions: originalOptions, complete: complete});
//                        }
//                        else if (corsxhrs[tag]) {
//                            corsxhrs[tag].counter += 1;
//                            jqXHR = corssend(corsxhrs[tag], originalOptions, complete);
//                            corsxhrs[tag].counter += 1;
//                        }
//                        else {
//                            corsxhrs[tag] = [{originalOptions: originalOptions, complete: complete}];
//                            $('<iframe>')
//                                .hide()
//                                .attr('src', urllib.unparse([parts[0], parts[1], 'ajaxproxy.htm']))
//                                .load(function () {
//                                    var xhrContext = this, counter = corsxhrs[tag].length;
//                                    corsxhrs[tag].forEach(function (item) {
//                                        jqXHR = corssend(xhrContext, item.originalOptions, item.complete);
//                                    });
//                                    corsxhrs[tag] = xhrContext;
//                                    corsxhrs[tag].counter = counter;
//                                })
//                                .appendTo(document.body);
//                        }
//                    },
//                    abort: function () {
//                        if (jqXHR) {
//                            jqXHR.abort();
//                        }
//                    }
//                };
//            }
//            else {
//
//            }
//        };
//
//    $.ajaxTransport('json', transport);
//    $.ajaxTransport('html', transport);
//    $.ajaxTransport('xml', transport);
//    $.ajaxTransport('text', transport);
//
//})(jQuery);
////跨二级子域名请求插件。跟登录逻辑没有关系。<end>
//
//var MD5 = function(args) {
//    var hexcase = 0;
//    var b64pad = "";
//    var chrsz = 8;
//    function hex_md5(s) {
//        return binl2hex(core_md5(str2binl(s), s.length * chrsz));
//    }
//    function b64_md5(s) {
//        return binl2b64(core_md5(str2binl(s), s.length * chrsz));
//    }
//    function hex_hmac_md5(key, data) {
//        return binl2hex(core_hmac_md5(key, data));
//    }
//    function b64_hmac_md5(key, data) {
//        return binl2b64(core_hmac_md5(key, data));
//    }
//    function calcMD5(s) {
//        return binl2hex(core_md5(str2binl(s), s.length * chrsz));
//    }
//
//    function core_md5(x, len) {
//        x[len >> 5] |= 0x80 << ((len) % 32);
//        x[(((len + 64) >>> 9) << 4) + 14] = len;
//        var a = 1732584193;
//        var b = -271733879;
//        var c = -1732584194;
//        var d = 271733878;
//        for ( var i = 0; i < x.length; i += 16) {
//            var olda = a;
//            var oldb = b;
//            var oldc = c;
//            var oldd = d;
//
//            a = md5_ff(a, b, c, d, x[i + 0], 7, -680876936);
//            d = md5_ff(d, a, b, c, x[i + 1], 12, -389564586);
//            c = md5_ff(c, d, a, b, x[i + 2], 17, 606105819);
//            b = md5_ff(b, c, d, a, x[i + 3], 22, -1044525330);
//            a = md5_ff(a, b, c, d, x[i + 4], 7, -176418897);
//            d = md5_ff(d, a, b, c, x[i + 5], 12, 1200080426);
//            c = md5_ff(c, d, a, b, x[i + 6], 17, -1473231341);
//            b = md5_ff(b, c, d, a, x[i + 7], 22, -45705983);
//            a = md5_ff(a, b, c, d, x[i + 8], 7, 1770035416);
//            d = md5_ff(d, a, b, c, x[i + 9], 12, -1958414417);
//            c = md5_ff(c, d, a, b, x[i + 10], 17, -42063);
//            b = md5_ff(b, c, d, a, x[i + 11], 22, -1990404162);
//            a = md5_ff(a, b, c, d, x[i + 12], 7, 1804603682);
//            d = md5_ff(d, a, b, c, x[i + 13], 12, -40341101);
//            c = md5_ff(c, d, a, b, x[i + 14], 17, -1502002290);
//            b = md5_ff(b, c, d, a, x[i + 15], 22, 1236535329);
//            a = md5_gg(a, b, c, d, x[i + 1], 5, -165796510);
//            d = md5_gg(d, a, b, c, x[i + 6], 9, -1069501632);
//            c = md5_gg(c, d, a, b, x[i + 11], 14, 643717713);
//            b = md5_gg(b, c, d, a, x[i + 0], 20, -373897302);
//            a = md5_gg(a, b, c, d, x[i + 5], 5, -701558691);
//            d = md5_gg(d, a, b, c, x[i + 10], 9, 38016083);
//            c = md5_gg(c, d, a, b, x[i + 15], 14, -660478335);
//            b = md5_gg(b, c, d, a, x[i + 4], 20, -405537848);
//            a = md5_gg(a, b, c, d, x[i + 9], 5, 568446438);
//            d = md5_gg(d, a, b, c, x[i + 14], 9, -1019803690);
//            c = md5_gg(c, d, a, b, x[i + 3], 14, -187363961);
//            b = md5_gg(b, c, d, a, x[i + 8], 20, 1163531501);
//            a = md5_gg(a, b, c, d, x[i + 13], 5, -1444681467);
//            d = md5_gg(d, a, b, c, x[i + 2], 9, -51403784);
//            c = md5_gg(c, d, a, b, x[i + 7], 14, 1735328473);
//            b = md5_gg(b, c, d, a, x[i + 12], 20, -1926607734);
//            a = md5_hh(a, b, c, d, x[i + 5], 4, -378558);
//            d = md5_hh(d, a, b, c, x[i + 8], 11, -2022574463);
//            c = md5_hh(c, d, a, b, x[i + 11], 16, 1839030562);
//            b = md5_hh(b, c, d, a, x[i + 14], 23, -35309556);
//            a = md5_hh(a, b, c, d, x[i + 1], 4, -1530992060);
//            d = md5_hh(d, a, b, c, x[i + 4], 11, 1272893353);
//            c = md5_hh(c, d, a, b, x[i + 7], 16, -155497632);
//            b = md5_hh(b, c, d, a, x[i + 10], 23, -1094730640);
//            a = md5_hh(a, b, c, d, x[i + 13], 4, 681279174);
//            d = md5_hh(d, a, b, c, x[i + 0], 11, -358537222);
//            c = md5_hh(c, d, a, b, x[i + 3], 16, -722521979);
//            b = md5_hh(b, c, d, a, x[i + 6], 23, 76029189);
//            a = md5_hh(a, b, c, d, x[i + 9], 4, -640364487);
//            d = md5_hh(d, a, b, c, x[i + 12], 11, -421815835);
//            c = md5_hh(c, d, a, b, x[i + 15], 16, 530742520);
//            b = md5_hh(b, c, d, a, x[i + 2], 23, -995338651);
//            a = md5_ii(a, b, c, d, x[i + 0], 6, -198630844);
//            d = md5_ii(d, a, b, c, x[i + 7], 10, 1126891415);
//            c = md5_ii(c, d, a, b, x[i + 14], 15, -1416354905);
//            b = md5_ii(b, c, d, a, x[i + 5], 21, -57434055);
//            a = md5_ii(a, b, c, d, x[i + 12], 6, 1700485571);
//            d = md5_ii(d, a, b, c, x[i + 3], 10, -1894986606);
//            c = md5_ii(c, d, a, b, x[i + 10], 15, -1051523);
//            b = md5_ii(b, c, d, a, x[i + 1], 21, -2054922799);
//            a = md5_ii(a, b, c, d, x[i + 8], 6, 1873313359);
//            d = md5_ii(d, a, b, c, x[i + 15], 10, -30611744);
//            c = md5_ii(c, d, a, b, x[i + 6], 15, -1560198380);
//            b = md5_ii(b, c, d, a, x[i + 13], 21, 1309151649);
//            a = md5_ii(a, b, c, d, x[i + 4], 6, -145523070);
//            d = md5_ii(d, a, b, c, x[i + 11], 10, -1120210379);
//            c = md5_ii(c, d, a, b, x[i + 2], 15, 718787259);
//            b = md5_ii(b, c, d, a, x[i + 9], 21, -343485551);
//
//            a = safe_add(a, olda);
//            b = safe_add(b, oldb);
//            c = safe_add(c, oldc);
//            d = safe_add(d, oldd);
//        }
//        return Array(a, b, c, d);
//    }
//    function md5_cmn(q, a, b, x, s, t) {
//        return safe_add(
//            bit_rol(safe_add(safe_add(a, q), safe_add(x, t)), s), b);
//    }
//    function md5_ff(a, b, c, d, x, s, t) {
//        return md5_cmn((b & c) | ((~b) & d), a, b, x, s, t);
//    }
//    function md5_gg(a, b, c, d, x, s, t) {
//        return md5_cmn((b & d) | (c & (~d)), a, b, x, s, t);
//    }
//    function md5_hh(a, b, c, d, x, s, t) {
//        return md5_cmn(b ^ c ^ d, a, b, x, s, t);
//    }
//    function md5_ii(a, b, c, d, x, s, t) {
//        return md5_cmn(c ^ (b | (~d)), a, b, x, s, t);
//    }
//
//    function core_hmac_md5(key, data) {
//        var bkey = str2binl(key);
//        if (bkey.length > 16)
//            bkey = core_md5(bkey, key.length * chrsz);
//
//        var ipad = Array(16), opad = Array(16);
//        for ( var i = 0; i < 16; i++) {
//            ipad[i] = bkey[i] ^ 0x36363636;
//            opad[i] = bkey[i] ^ 0x5C5C5C5C;
//        }
//        var hash = core_md5(ipad.concat(str2binl(data)), 512 + data.length
//            * chrsz);
//        return core_md5(opad.concat(hash), 512 + 128);
//    }
//
//    function safe_add(x, y) {
//        var lsw = (x & 0xFFFF) + (y & 0xFFFF);
//        var msw = (x >> 16) + (y >> 16) + (lsw >> 16);
//        return (msw << 16) | (lsw & 0xFFFF);
//    }
//
//    function bit_rol(num, cnt) {
//        return (num << cnt) | (num >>> (32 - cnt));
//    }
//
//    function str2binl(str) {
//        var bin = Array();
//        var mask = (1 << chrsz) - 1;
//        for ( var i = 0; i < str.length * chrsz; i += chrsz)
//            bin[i >> 5] |= (str.charCodeAt(i / chrsz) & mask) << (i % 32);
//        return bin;
//    }
//
//    function binl2hex(binarray) {
//        var hex_tab = hexcase ? "0123456789ABCDEF" : "0123456789abcdef";
//        var str = "";
//        for ( var i = 0; i < binarray.length * 4; i++) {
//            str += hex_tab
//                    .charAt((binarray[i >> 2] >> ((i % 4) * 8 + 4)) & 0xF)
//                + hex_tab
//                    .charAt((binarray[i >> 2] >> ((i % 4) * 8)) & 0xF);
//        }
//        return str;
//    }
//
//    function binl2b64(binarray) {
//        var tab = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
//        var str = "";
//        for ( var i = 0; i < binarray.length * 4; i += 3) {
//            var triplet = (((binarray[i >> 2] >> 8 * (i % 4)) & 0xFF) << 16)
//                | (((binarray[i + 1 >> 2] >> 8 * ((i + 1) % 4)) & 0xFF) << 8)
//                | ((binarray[i + 2 >> 2] >> 8 * ((i + 2) % 4)) & 0xFF);
//            for ( var j = 0; j < 4; j++) {
//                if (i * 8 + j * 6 > binarray.length * 32)
//                    str += b64pad;
//                else
//                    str += tab.charAt((triplet >> 6 * (3 - j)) & 0x3F);
//            }
//        }
//        return str;
//    }
//    return hex_md5(args);
//};
//
//(function($){
//
//    function showLoginName(){
//        var focusHost = 'http://i.'+hostName+'.cn';
//        var cookieHandleFunc = PassportSC.cookieHandle();
//        var appId = "1008",secretKey = "f51606329bc76e764e6c0d104d2bf3f0";
//        $.getJSON('http://i.'+hostName+'.cn/getaudit?callback=?&appId=' + appId + '&secretKey='+ secretKey, function(res){
//
//            var rtk = res.data.rtk;
//            $.getJSON('http://i.'+hostName+'.cn/passport-userinfo/getuserinfo?_t='+ Math.random() + '&userId=' + encodeURIComponent(cookieHandleFunc) + '&appId=' + appId + '&secretKey='+ secretKey +'&rtk='+ rtk +'&callback=?',function(data){
//                if(data.data.nickName != undefined){
//                    var nickName = unescape(data.data.nickName.replace(/\\/g, "%"));
//                    loginSucessFn(nickName);
//                }
//            })
//        });
//    }
//    showLoginName();
//
//    var sceHost = "http://f_uc_20140707.cdn.sohusce.com";
//    var focusHost = "http://i."+hostName+".cn";
//    var loginHost = "http://login."+hostName+".cn";
//
//    var validateTool = {
//        checkPhone: function(value) {
//            return /^1[3|4|5|7|8]\d{9}$/.test(value);
//        },
//        checkPaswd: function(value) {
//            return (value.length > 6 && value.length < 16) ? true : false;
//        }
//    }
//    function myPlaceHolder(mobileFormNode) {
//        mobileFormNode.delegate(".uname label,.upass label", "click", function() {
//            return $(this).hide(), $(this).prev("input").focus();
//        });
//        mobileFormNode.delegate(".uname input,.upass input", "focus", function() {
//            return $(this).next("label").hide();
//        });
//        mobileFormNode.delegate(".uname input,.upass input", "blur", function() {
//            return "" === $.trim($(this).val()) ? $(this).next("label").show() : void 0;
//        });
//    }
//
//    function autoLoginFn(autoLoginId){
//        if(autoLoginId.val() == 1){
//            autoLoginId.val('0');
//        }else if(autoLoginId.val() == 0){
//            autoLoginId.val('1');
//        }
//    }
//    //校验手机号码：必须以13/4/5/7/8数字开头的11位数字
//    function isMobile(s)
//    {
//        var patrn = /^1[3|4|5|7|8]\d{9}$/;
//        if(!patrn.exec(s))
//        {
//            return false;
//        }
//        return true;
//    }
//    function plusXing (str,frontLen,endLen) {
//        var len = str.length-frontLen-endLen;
//        var xing = '';
//        for (var i=0;i<len;i++) {
//            xing+='*';
//        }
//        return str.substr(0,frontLen)+xing+str.substr(str.length-endLen);
//    }
//    function isEmail(s)
//    {
//        var patrn = /^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$/;
//        if(!patrn.exec(s))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    function checkNameFn(value){
//        if(isEmail(value)){
//            var name = value.split('@')[0];
//            var domainName = value.split('@')[1];
//            if(domainName == hostName+'.cn'){
//                value = name;
//            }else if(domainName == 'sohu.com'){
//                if(isMobile(name)){
//                    value = plusXing(name,3,4);
//                }else{
//                    value = '焦点网友'+ name.substr(0,5);
//                }
//            }
//        }
//        return value;
//    }
//    function loginSucessFn(value){
//        if(window._isReload==true){
//            window.location.reload();
//        }else{
//            var value = checkNameFn(value);
//            $('.login-before').hide();
//            $('.login-after .user').text(value);
//            $('.login-after').show();
//            $('#login-dialog-box').hide();
//            $('#myDialog').hide();
//        }
//    }
//
//    function changecode(obj) {
//        obj.find('.yanzhengcode').attr('src', 'http://login.'+hostName+'.cn/imgcode/getCaptcha?type=1&t='+(+ new Date()));
//    }
//
//    var accountLogin = {
//        tmpl: '<form action="" id="login_mini">\
//                    <div class="b1">\
//                        <div class="login_msg hidden"></div>\
//                        <div class="login_msg1">&nbsp;</div>\
//                        <div class="uname">\
//                            <input type="text" name="email" id="username11" value=""/>\
//                            <label>请输入昵称、注册邮箱或搜狐通行证</label>\
//                        </div>\
//                        <div class="upass">\
//                            <input type="password" name="pwd" id="password11" value=""/>\
//                            <label>请输入密码</label>\
//                        </div>\
//                        <div class="validation" >\
//                            <input type="text" name="validation" id="validation"/>\
//                            <img src="" class="yanzhengcode" alt=""/>\
//                            <a href="javascript:void(0);" class="c_blue valid_btn">换一张</a>\
//                        </div>\
//                        <div class="auto_login">\
//                            <input type="checkbox" id="autologin" name="autologin" checked value="1"/>\
//                            <label for="autologin" style="font-size:14px">下次自动登录</label>\
//                            <a href="https://passport.sohu.com/web/RecoverPwdInput.action" class="forgetPwd" target="_blank">忘记密码?</a>\
//                        </div>\
//                        <div class="submit">\
//                            <input type="button" class="btn" id="mysubmit" value="登录"/>\
//                            <span class="reg"><a href="javascript:;" class="phoneLogin">手机号登录</a> | <a href="http://login.focus.cn/w/reg?ru='+window.location.href+'" target="_blank">立即注册</a></span>\
//                        </div>\
//                    </div>\
//                </form>',
//        initilize: function(options) {
//            this.option = options;
//            this.render();
//            this.$elem = $('#login_mini');
//            this.bindEvents();
//        },
//
//        render: function() {
//            $('.wrpper-login').append(this.tmpl);
//            //$("#login_mini .validation").hide();
//            $("#login_mini .login_msg").hide();
//            myPlaceHolder($('#login_mini'));
//            changecode($('#login_mini'));
//            //   $('#login_mini #username11').val('');
//            //   $('#login_mini #password11').val('');
//        },
//
//
//        bindEvents: function() {
//            $('#login_mini #mysubmit').bind('click', $.proxy(function(e){
//                $('#wrpper-login .login_msg').html('');
//                this.login();
//            }, this));
//            this.$elem.find('.phoneLogin').bind('click', function(e){
//                $(document).trigger('changePhoneLogin');
//                e.preventDefault();
//            });
//            this.$elem.delegate(".valid_btn, .validation>img", "click", $.proxy(function() {
//                this.getCaptchaFunc();
//            }, this));
//            $('#login_mini #autologin').on('click',function(){
//                autoLoginFn($(this));
//            });
//        },
//
//        getCaptchaFunc: function() {
//            this.$elem.find(".validation").show();
//            this.$elem.find(".validation img").attr("src", 'http://login.'+hostName+'.cn/imgcode/getCaptcha?type=1' + "&" + Math.random());
//        },
//
//        login: function() {
//            var that = this;
//            var option = {
//                passport: $('#login_mini .uname input').val(),
//                password: MD5($('#login_mini .upass input').val()),
//                code: $('#login_mini .validation input').val()
//            }
//            if (!this.trim(option.passport) || !this.trim($('#login_mini .upass input').val())) {
//                this.$elem.find('.login_msg').show().html('请输入正确的用户名和密码!');
//                return false;
//            }
//            $.ajax({
//                url:loginHost+'/login/loginByPassport',
//                dataType:'jsonp',
//                data: {
//                    passport:option.passport,
//                    password:option.password,
//                    auto:Number($('#login_mini #autologin').val()),
//                    imgcode:option.code
//                },
//                jsonp:'callback',
//                success:function(data){
//                    if (data.errorCode === 0) {
//                        //   loginSucessFn($('#login_mini #username11').val());
//                        showLoginName();
//
//                    } else if (data.errorCode == 3) {
//                        $('#login_mini .validation').show();
//                        changecode($('#login_mini'));
//                        $('#login_mini .valid_btn').bind('click',function(){
//                            changecode($('#login_mini'));
//                        });
//                        $('#login_mini .login_msg').show();
//                        $('#login_mini .login_msg').html(data.errorMessage);
//                    }else if(data.errorCode === 8){
//                        window.location.href = "http://i."+hostName+".cn/myfocus/bindMobile?ru="+window.location.href;
//                    }else {
//                        $('#login_mini .login_msg').html(data.errorMessage);
//                        $('#login_mini .login_msg').show();
//                    }
//
//                }
//            });
//        },
//
//        show: function() {
//            this.$elem.show();
//        },
//
//        hide: function() {
//            this.$elem.hide();
//        },
//        trim: function(str) {
//            return str.replace(/(^s*)|(s*$)/g, "");
//        },
//        hideOldLogin: function() {
//            this.$elem.parent('.wrpper-login').hide();
//        },
//
//        showOldLogin: function() {
//            this.$elem.parent('.wrpper-login').show();
//        }
//    }
//
//    var phoneLogin = {
//        tmpl: '<div id="pplogin">\
//                    <div class="b1">\
//                        <div class="login_msg hidden" style="display: none;"></div>\
//                        <div class="uname"><input type="text" name="email" id="username11" value="" style="vertical-align: middle;"><label style="vertical-align: middle;">请输入手机号</label></div>\
//                        <div class="upass"><input type="password" name="pwd" id="password11" value="" style="vertical-align: middle;"><label style="vertical-align: middle;">请输入密码</label></div>\
//                        <div class="validation"><input type="text" name="validation" id="validation" style="vertical-align: middle;"><img src="" alt="" class="yanzhengcode" style="border: none;"><a href="javascript:void(0);" id="changeImg" class="c_blue valid_btn">换一张</a></div>\
//                        <div class="auto_login"><input type="checkbox" id="autologin1" name="autologin" checked="" value="1" style="vertical-align: middle;"><label for="autologin" style="font-size: 14px; vertical-align: middle;">下次自动登录</label><a href="https://passport.sohu.com/web/RecoverPwdInput.action" class="forgetPwd" target="_blank">忘记密码?</a></div>\
//                        <div class="submit"><input type="button" class="btn" id="pplogin-btn" value="登录" style="vertical-align: middle;"><span class="reg"><a href="javascript:;" target="_blank" class="account-login">账号登录</a> | <a href="http://login.focus.cn/w/reg?ru='+window.location.href+'" target="_blank">立即注册</a></span></div>\
//                    </div>\
//                </div>',
//        initilize: function(options) {
//            this.option = options;
//            this.render();
//            this.$elem = $('#pplogin');
//            this.bindEvents();
//        },
//
//        render: function() {
//            $(this.tmpl).insertBefore($('.wrpper-login'));
//            $("#pplogin .login_msg").hide();
//            myPlaceHolder($('#pplogin'));
//        },
//
//        bindEvents: function() {
//            var that = this;
//            this.$elem.find('.account-login').bind('click', function(e){
//                $(document).trigger('changeAccountLogin');
//                e.preventDefault();
//            });
//            this.$elem.find('.uname input, .upass input, .validation input').bind('keyup', $.proxy(function(e){
//                if (e.keyCode == 13) {
//                    $('#pplogin .login_msg').html('');
//                    this.login();
//                }
//            }, this));
//            $('#pplogin-btn').bind('click', $.proxy(function(e){
//                $('#pplogin .login_msg').html('');
//                this.login();
//            }, this));
//            $('#pplogin #autologin1').on('click',function(){
//                autoLoginFn($(this));
//            });
//        },
//
//        show: function() {
//            this.$elem.show();
//        },
//
//        hide: function() {
//            this.$elem.hide();
//        },
//
//        trim: function(str) {
//            return str.replace(/(^s*)|(s*$)/g, "");
//        },
//
//
//
//        login: function() {
//            var that = this;
//            //  var ap = $("#pplogin input[name='auto_login']") ? 1 : 0;
//            var option = {
//                //   aotologin: ap,
//                phoneNumber: $('#pplogin .uname input').val(),
//                password: MD5($('#pplogin .upass input').val()),
//                code: $('#pplogin .validation input').val()
//            }
//            if (!validateTool.checkPhone(this.trim(option.phoneNumber)) || !this.trim($('#pplogin .upass input').val())) {
//                this.$elem.find('.login_msg').show().html('请输入正确的用户名和密码!');
//                return false;
//            }
//            $.ajax({
//                url:loginHost+'/login/loginByMobile',
//                dataType:'jsonp',
//                data: {
//                    mobile:option.phoneNumber,
//                    password:option.password,
//                    auto:Number($('#pplogin #autologin1').val()),
//                    imgcode:option.code
//                },
//                jsonp:'callback',
//                success:function(data){
//                    if (data.errorCode === 0) {
//                        //  loginSucessFn($('#pplogin #username11').val());
//                        showLoginName();
//                    } else if (data.errorCode == 3) {
//                        changecode($('#pplogin'));
//                        //$('#pplogin .validation').show();
//                        /*
//                        $('#changeImg').unbind('click').bind('click',function(){
//                            changecode($('#pplogin'));
//                        });*/
//                        $('#pplogin .login_msg').show();
//                        $('#pplogin .login_msg').html(data.errorMessage);
//                    } else {
//                        $('#pplogin .login_msg').html(data.errorMessage);
//                        $('#pplogin .login_msg').show();
//                    }
//
//                }
//            });
//        }
//    }
//
//    var phonevalidateLogin = {
//        tmpl: '<form action="" onsubmit="return false" id="mobile_form" style="display:none">\
//                    <div class="b1">\
//                        <div class="login_msg hidden"></div>\
//                        <div class="login_msg1">&nbsp;</div>\
//                        <div class="uname">\
//                            <input type="text" name="mobile" id="mobile" maxLength="11" value="" style="width:120px;"/>\
//                            <label>请输入手机号码</label>&nbsp;&nbsp;<span id="authcode"></span>\
//                            <div class="phone-validate-wrapper" id="validateId" data-sendBtn="authcode" data-mobile="mobile">\
//                                <div class="phone-validate-content">\
//                                    <div class="phone-validate-inline-container phone-validate-code-container">\
//                                        <img src="" id="imgcode" style="cursor:pointer;width:80px;height:23px;">\
//                                    </div>\
//                                    <div class="phone-validate-inline-container">\
//                                        <input type="text" maxlength="4" id="phone-validate-code"><input type="button" value="确认" data-for="mobile_answer" id="phone-validate-submit-btn">\
//                                    </div>\
//                                    <div class="phone-validate-action">\
//                                        <a href="javascript:void(0);" id="textId" class="phone-validate-refresh-link">看不清?</a>\
//                                        <div class="phone-validate-inline-container phone-validate-action-tip">请输入文字</div>\
//                                    </div>\
//                                </div>\
//                                <div class="phone-validate-bottom"></div>\
//                            </div>\
//                        </div>\
//                        <div class="upass">\
//                            <input type="text" name="answer" id="answer" value=""/>\
//                            <label>请输入验证码</label>\
//                        </div>\
//                        <div class="auto_login">\
//                            <input type="checkbox" id="autologin3" name="autologin" checked value="1"/>\
//                            <label for="autologin" style="font-size:14px">下次自动登录</label>\
//                        </div>\
//                        <div class="submit">\
//                            <input type="button" class="btn" id="mysubmit11" value="登录"/>&nbsp;<span style="display:inline-block;width:138px;text-align:center;"><a target="_blank" href="http://login.focus.cn/w/reg?ru='+window.location.href+'" style="color:#666;font-size:14px;">立即注册</a></span>\
//                        </div>\
//                    </div>\
//                </form>',
//
//        showCaptchHtml:function(){
//            var captchHtml = '<a class="m_send_code invalid" id="getCode" href="javascript:void(0);">点击获取验证码</a><span class="m_resend" id="resendId" style="display:none;"><span class="c_red time" id="timeId">60</span>秒后可重新发送</span><span class="result"><span class="failed"></span><span class="msg"></span>';
//            var authCodeNode = $('#authcode');
//            authCodeNode.html(captchHtml);
//            var sendCaptchaNode = authCodeNode.find(".m_send_code");
//            sendCaptchaNode.css({
//                "font-size": "12px",
//                color: "#999",
//                "margin-left": "10px"
//            });
//            authCodeNode.find(".m_resend").css({
//                "font-size": "12px",
//                color: "#999",
//                "margin-left": "10px"
//            });
//            authCodeNode.find(".time").css({
//                color: "#d80100",
//                "text-decoration": "none"
//            });
//        },
//
//        initilize: function(options) {
//            this.option = options;
//            this.render();
//            this.$elem = $('#mobile_form');
//            this.invalidCodeStyle = {
//                "text-decoration": "none",
//                "background-color": "#f8f8f8",
//                "padding": "11px 8px",
//                "color": "#666",
//                "font-size": "14px",
//                "margin-left":"0px"
//            };
//            this.validCodeStyle = {
//                "text-decoration": "none",
//                "background-color": "#539bdd",
//                "padding": "11px 8px",
//                "color": "#fff",
//                "font-size": "14px"
//            };
//            this.bindEvents();
//        },
//
//        render: function() {
//            $('.wrpper-login').append(this.tmpl);
//            $("#mobile_form .login_msg").hide();
//            myPlaceHolder($('#mobile_form'));
//
//        },
//
//        bindEvents: function() {
//            var that = this;
//            $('#mobile_form #mysubmit11').bind('click', $.proxy(function(e){
//                $('.wrpper-login .login_msg').html('');
//                this.login();
//            }, this));
//            this.showCaptchHtml();
//            this.sendCaptchaDisabled();
//            this.authcode = $('#authcode');
//            this.imgcode = $('#imgcode');
//            this.mobile = $('#mobile');
//            this.loginMsg = $('.login_msg');
//            this.validateId = $('#validateId');
//            this.phoneValidateCode = $('#phone-validate-code');
//            this.phoneValidateCodeBtn= $('#phone-validate-submit-btn');
//            this.answer = $('#answer');
//            this.autologin3 = $('#mobile_form #autologin3');
//            this.sendSuccessFlag='';
//            this.resendId = $('#resendId');
//            this.getCode = $('#getCode');
//            this.timeId = $('#timeId');
//            this.time = 60;
//            $('#mobile_form #autologin3').on('click',function(){
//                autoLoginFn($(this));
//            });
//            this.getCode.on('click',function(){
//                that.loginMsg.text('');
//                that.loginMsg.hide();
//                if (/^(13|14|15|17|18)[0-9]{9}$/.test(that.mobile.val())) {
//                    that.imgcode.attr('src',loginHost+"/imgcode/getCaptcha?type=1"+Math.random()*1000+1);
//                    that.validateId.show();
//                }else{
//                    that.loginMsg.text('请输入正确的手机号！');
//                    that.loginMsg.show();
//                }
//            });
//            $('#textId,#imgcode').on('click',function(){
//                that.imgcode.attr('src',loginHost+"/imgcode/getCaptcha?type=1&"+Math.random()*1000+1);
//            });
//            /* this.mobile.on('focus',function(){
//             that.loginMsg.text('');
//             that.loginMsg.hide();
//             });*/
//            //图片验证码校验
//            this.phoneValidateCodeBtn.on('click',function(){
//                var imgcode = that.phoneValidateCode.val();
//                $.ajax({
//                    url:loginHost+'/imgcode/verifycaptcha',
//                    dataType:'jsonp',
//                    data:{'input':imgcode},
//                    jsonp:'callback',
//                    success:function(result){
//                        $("#mobile_form #validateId").hide();
//                        if(result.errorCode == 0){
//                            sendValidateCodeFn(imgcode);
//                        }else{
//                            $("#mobile_form .login_msg").text(result.errorMessage);
//                            $("#mobile_form .login_msg").show();
//                            that.phoneValidateCode.val('');
//                        }
//
//                    }
//                });
//            });
//            //下发手机验证码
//            function sendValidateCodeFn(imgcode){
//                $.ajax({
//                    url:loginHost+'/captcha/secure/getMobileCaptcha',
//                    dataType:'jsonp',
//                    data:{'mobile': that.mobile.val(), 'type':2,'imgcode':imgcode},
//                    jsonp:'callback',
//                    success:function(result){
//                        if(result.errorCode == 0){
//                            $("#mobile_form #validateId").hide();
//                            //that.phoneValidateCode.val('');
//                            that.authcode.find('#getCode').hide();
//                            that.authcode.find('#resendId').show();
//                            that.timer = setInterval(timeFn,1000);
//                            that.sendSuccessFlag = 0;
//                        }else if(result.errorCode == 1 || result.errorCode == 2 || result.errorCode == 3 || result.errorCode == 4 || result.errorCode == 5){
//                            $("#mobile_form .login_msg").text(result.errorMessage);
//                            $("#mobile_form .login_msg").show();
//                        }
//                    }
//                });
//            }
//            function timeFn(){
//                that.time--;
//                that.timeId.text(that.time);
//                if(that.time < 0){
//                    clearInterval(that.timer);
//                    that.authcode.find('#getCode').show();
//                    that.authcode.find('#resendId').hide();
//                    that.time = 60;
//                    that.timeId.text(that.time);
//                }
//            }
//
//
//
//        },
//        sendCaptchaDisabled:function() {
//            var authCodeNode = $('#authcode');
//            authCodeNode.find(".m_send_code").addClass("invalid"), authCodeNode.find(".m_send_code.invalid").css(this.invalidCodeStyle);
//        },
//        show: function() {
//            this.$elem.show();
//        },
//
//        hide: function() {
//            this.$elem.hide();
//        },
//        trim: function(str) {
//            return str.replace(/(^s*)|(s*$)/g, "");
//        },
//        login: function() {
//            var that = this;
//            //  var ap = $("#mobile_form input[name='auto_login']") ? 1 : 0;
//            var option = {
//                // aotologin: ap,
//                phoneNumber: $('#mobile_form .uname input').val(),
//                password: MD5($('#mobile_form .upass input').val()),
//                code: $('#mobile_form .validation input').val()
//            };
//
//            if (!validateTool.checkPhone(this.trim(option.phoneNumber)) && !$('#mobile_form .upass input').val()) {
//                this.$elem.find('.login_msg').show().html('请输入正确的用户名和密码!');
//                return false;
//            }
//
//            if(that.sendSuccessFlag == 0){
//                $.ajax({
//                    url:loginHost+'/login/secure/loginByCaptcha',
//                    dataType:'jsonp',
//                    data:{
//                        'mobile': that.mobile.val(),
//                        'captcha':Number(that.answer.val()),
//                        'auto':Number(that.autologin3.val()),
//                        'imgcode' : $('#phone-validate-code').val()
//                    },
//                    jsonp:'callback',
//                    success:function(result){
//                        $("#mobile_form #validateId").hide();
//                        that.phoneValidateCode.val('');
//                        if(result.errorCode == 0){
//                            //   loginSucessFn(that.mobile.val());
//                            showLoginName();
//                        }else if(result.errorCode == 1 || result.errorCode == 2 || result.errorCode == 3 || result.errorCode == 4 || result.errorCode == 5 || result.errorCode == 6 || result.errorCode == 7 || result.errorCode == 8 || result.errorCode == 9){
//                            $("#mobile_form .login_msg").text(result.errorMessage);
//                            $("#mobile_form .login_msg").show();
//                        }
//                    }
//                });
//            }
//        }
//    }
//
//    var majorStructure = {
//
//        loginFrameHtml: '<div class="my_msg" id="login-dialog-box" style="width:345px">\
//                                <div id="login_mini_block" class="login_mini">\
//                                    <h3 class="denglu">登录</h3>\
//                                    <div class="wrpper-login">\
//                                        <div class="login_type_menu">\
//                                            <a href="javascript:void(0);" class="cur">账户密码登录<b></b></a><a href="javascript:void(0);">手机验证码登录<b></b></a>\
//                                        </div>\
//                                    </div>\
//                                    <div class="other_login"><h3>合作账号登录</h3><ul><li><a id="qqHrefId" target="_blank" href="http://passport.sohu.com/openlogin/request.action?provider=qq&appid=1028&ru='+encodeURIComponent("http://login.focus.cn/thirdpartlogin?appId=1004&secretKey=0216e919227a812d872e059bde028c31&source=1&ru="+window.location.href+"&type=qq")+'" class="qqlogin"><img src="http://f_uc_20140707.cdn.sohusce.com/passport/images/sohupp-qq.gif" alt=""/><span>腾讯QQ</span></a></li>\
//                                    <li><a target="_blank" href="http://passport.sohu.com/openlogin/request.action?provider=sina&appid=1028&ru='+encodeURIComponent("http://login.focus.cn/thirdpartlogin?appId=1004&secretKey=0216e919227a812d872e059bde028c31&source=1&ru="+window.location.href+"&type=sina")+'" class="sinaLogin"><img src="http://f_uc_20140707.cdn.sohusce.com/passport/images/sina.png" alt=""/><span>新浪微博</span></a></li><li><a href="javascript:;" class="phonecodeLogin">手机验证码登录</a></li></ul></div>\
//                                </div>\
//                            <div class="close">×</div></div>',
//        maskLayer: '<div class="my_dialog" id="myDialog"></div>',
//
//        initilize: function(option) {
//            this.option = option;
//        },
//
//        render: function() {
//            var that = this;
//            var frameLocationHeight, msgWidth, msgHeight;
//            $("head").append('<link href="http://house.focus.cn/common/modules/house_index/2014/css/login_mini.css" rel="stylesheet" type="text/css"/>');
//            $("body").append(this.loginFrameHtml).append(this.maskLayer);
//            msgWidth = $(".my_msg").outerWidth();
//            msgHeight = $(".my_msg").outerHeight();
//
//            if ($.browser.msie && "6.0" === $.browser.version) {
//                frameLocationHeight = $(window).scrollTop() + $(window).height() / 2 - 220;
//                $(window).scroll(function() {
//                    $(".my_msg").css({
//                        top: "" + ($(window).scrollTop() + $(window).height() / 2 - 220) + "px"
//                    });
//                })
//            } else {
//                frameLocationHeight = $(window).height() / 2 - 220;
//            }
//
//            var msgBoxStyle = {
//                my_dialog: {
//                    position: "absolute",
//                    left: "0",
//                    top: "0",
//                    "z-index": "99998",
//                    width: "100%",
//                    height: "" + $(document).height() + "px",
//                    background: "#000",
//                    opacity: "0.5",
//                    filter: "alpha(opacity=50)",
//                    "-moz-opacity": "0.65"
//                },
//                my_msg: {
//                    left: "50%",
//                    top: "" + frameLocationHeight + "px",
//                    padding: "0px",
//                    background: "#fff",
//                    "z-index": "99999",
//                    width: "345px",
//                    "margin-left": "" + -msgWidth / 2 + "px",
//                    "font-size": "12px"
//                    //overflow: "hidden"
//                },
//                close: {
//                    position: "absolute",
//                    top: "20px",
//                    right: "20px",
//                    border: "2px solid #ccc",
//                    color: "#ccc",
//                    width: "24px",
//                    height: "24px",
//                    "font-size": "24px",
//                    "line-height": "24px",
//                    "text-align": "center",
//                    cursor: "pointer"
//                }
//            };
//            this.setCss(msgBoxStyle, "class", "");
//            this.setCss(this.option.css);
//            this.setCss({
//                img: {
//                    border: "none"
//                },
//                input: {
//                    "vertical-align": "middle"
//                },
//                label: {
//                    "vertical-align": "middle"
//                }
//            }, "tag");
//            this.setCss({
//                hidden: {
//                    display: "none"
//                }
//            });
//            $(".my_msg").show();
//            $(".my_dialog").show();
//            this.$elem = $('#login-dialog-box');
//            this.bindEvents();
//            $(document).trigger('loginFrameComplete', this.option);
//        },
//
//        bindEvents: function() {
//            var fatherScope = this;
//            $(".login_type_menu a").click(function(e) {
//                var index = $(this).index(), that = $(this);
//                fatherScope.changeTab(index, that);
//            });
//            this.$elem.find('.phonecodeLogin').bind('click', function(e){
//                $(document).trigger('changePhCodeLogin', this);
//                e.preventDefault();
//            });
//            this.$elem.find('.close').bind('click', $.proxy(function(e) {
//                this.closeDialog();
//            }, this));
//        },
//
//        changeTab: function(index, that) {
//            $(".login_type_menu a").removeClass("cur");
//            that.addClass("cur");
//            $("#login_mini_block form").hide();
//            $("#login_mini_block form").eq(index).show();
//        },
//
//        closeDialog: function() {
//            $(".my_msg").remove();
//            $(".my_dialog").remove();
//        },
//
//        thirdLoginUrl: function(thirdPartName) {
//            var ru = encodeURIComponent("" + focusHost + "/thirdpartlogin?appId=" + this.option.appId + "&secretKey=" + this.option.secretKey + "&ru=" + this.option.ru + "&hun=0");
//            return "http://passport.sohu.com/openlogin/request.action?provider=" + thirdPartName + "&appid=1028&ru=" + ru;
//        },
//
//        setCss: function(style, type, id) {
//            var styleValue, styleKey = null,
//                isSub = null;
//            null == type && (type = "class"), null == id && (id = "#login_mini_block"), "class" === type ? isSub = "." : "tag" === type && (isSub = "");
//            for (styleKey in style) styleValue = style[styleKey], $("" + id + " " + isSub + styleKey).css(styleValue);
//        }
//    }
//
//    var mediator = (function(){
//        $(document).bind('changePhoneLogin', function(e){
//            phoneLogin.show();
//            changecode($('#pplogin'));
//            $('#changeImg').bind('click',function(){
//                changecode($('#pplogin'));
//            });
//            accountLogin.hideOldLogin();
//            $('.phonecodeLogin').show();
//            e.preventDefault();
//        });
//        $(document).bind('changeAccountLogin', function(e){
//            phoneLogin.hide();
//            accountLogin.showOldLogin();
//            accountLogin.show();
//            phonevalidateLogin.hide();
//            $('.phonecodeLogin').hide();
//            e.preventDefault();
//        });
//        $(document).bind('changePhCodeLogin', function(e, elem){
//            phoneLogin.hide();
//            accountLogin.showOldLogin();
//            majorStructure.changeTab(1, $('.login_type_menu a:eq(1)'));
//            $(elem).hide();
//            e.preventDefault();
//        });
//        $(document).bind('loginFrameComplete', function(e, options) {
//            accountLogin.initilize(options);
//            phoneLogin.initilize(options);
//            phonevalidateLogin.initilize(options);
//            $(document).trigger('changePhoneLogin');
//        });
//    })()
//
//    window.FCLogin = {
//        initilize: function(appInfo) {
//            majorStructure.initilize({
//                ru: appInfo.ru,
//                appId: appInfo.appId,
//                secretKey: appInfo.secretKey,
//                sc: appInfo.sc,
//                fc: appInfo.fc,
//                css: appInfo.css,
//                commonForm: "appId=" + appInfo.appId + "&secretKey=" + appInfo.secretKey
//            });
//        },
//
//        close: function() {
//            majorStructure.closeDialog();
//        },
//
//        checkUserStatus: function(callback) {
//
//        },
//
//        logout: function(callback) {
//            sessionStorage.logined = 0;
//            window.location.href = "http://login."+hostName+".cn/login/logout?ru=" + window.location.href;
//        },
//
//        open: function() {
//            majorStructure.render();
//        }
//    }
//})($, undefined)