package com.dyt.Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        while(true){
            //准备接收包
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet);//阻塞式接收包

            //断开连接 bye
            byte[] data = packet.getData();

            String receiveData = new String(data).trim();
            System.out.println(receiveData);

            if(receiveData.equals("bye")){
                break;
            }
        }

        socket.close();
    }
}
