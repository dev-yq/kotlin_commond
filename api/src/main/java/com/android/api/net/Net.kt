package com.android.api.net

import okhttp3.Interceptor

/**
 *
 * @作者： $User$
 * @时间： $date$
 * @描述：
 *
 */

 class   Net constructor(
    map: Map<String, String> ,
    interrupter: List<Interceptor>){



    class     Builder{

        companion object{

            var   map = mutableMapOf<String ,String>()

            var     interrupter =  mutableListOf<Interceptor>()
            private  var   builder:Builder = Builder()


            //添加请求头
            fun     addHeader(key:String   ,value:String):Builder{
                map.put(key ,value)

                return  builder

            }


            //添加拦截器
            fun     addInterceptor( interceptor: Interceptor):Builder{
                interrupter.add(interceptor)
                return  builder
            }



            fun       build():Net{
                return    Net(map , interrupter)
            }

        }

    }


}





















