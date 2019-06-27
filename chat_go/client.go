/**
  * @Time : 2019/5/17 10:41 
  * @Author : 老肥猪
  * @File : client
  * @Software: GoLand
  */
package main

import (
	"fmt"
	"net"
)

func main() {
	//主动连接服务器
	conn, err := net.Dial("tcp", "127.0.0.1:8000")
	if err != nil {
		fmt.Println("err = ", err)
		return
	}

	defer conn.Close()

	//发送数据
	conn.Write([]byte("are u ok?"))

}
