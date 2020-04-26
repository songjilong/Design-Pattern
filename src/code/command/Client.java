package code.command;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/25 23:12
 */
public class Client {
    @Test
    public void testLight() {
        //创建命令接收者
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯的一组操作（开和关）
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建命令调用者
        RemoteController remoteController = new RemoteController();
        //设置命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        //执行命令
        System.out.println("----按下开灯按钮----");
        remoteController.pressOnButton(0);
        System.out.println("----按下关灯按钮----");
        remoteController.pressOffButton(0);
        System.out.println("----按下撤销按钮----");
        remoteController.pressUndoButton(0);
    }

    @Test
    public void testTV() {
        //创建命令接收者
        TvReceiver tvReceiver = new TvReceiver();
        //创建电灯的一组操作（开和关）
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        //创建命令调用者
        RemoteController remoteController = new RemoteController();
        //设置命令
        remoteController.setCommand(0, tvOnCommand, tvOffCommand);
        //执行命令
        System.out.println("----按下开灯按钮----");
        remoteController.pressOnButton(0);
        System.out.println("----按下关灯按钮----");
        remoteController.pressOffButton(0);
        System.out.println("----按下撤销按钮----");
        remoteController.pressUndoButton(0);
    }
}
