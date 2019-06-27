package com.cn.client.module.player.handler;

import com.cn.common.core.annotion.SocketCommand;
import com.cn.common.core.annotion.SocketModule;
import com.cn.common.module.ModuleId;
import com.cn.common.module.player.PlayerCmd;

/**
 * 玩家模块
 *
 * @author laofeizhu
 */
@SocketModule(module = ModuleId.PLAYER)
public interface PlayerHandler {


    /**
     * 创建并登录帐号
     *
     * @param resultCode
     * @param data       {@link null}
     */
    @SocketCommand(cmd = PlayerCmd.REGISTER_AND_LOGIN)
    void registerAndLogin(int resultCode, byte[] data);


    /**
     * 创建并登录帐号
     *
     * @param resultCode
     * @param data       {@link null}
     */
    @SocketCommand(cmd = PlayerCmd.LOGIN)
    void login(int resultCode, byte[] data);

}
