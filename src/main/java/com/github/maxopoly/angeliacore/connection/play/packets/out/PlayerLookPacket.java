package com.github.maxopoly.angeliacore.connection.play.packets.out;

import com.github.maxopoly.angeliacore.packet.WriteOnlyPacket;
import java.io.IOException;

public class PlayerLookPacket extends WriteOnlyPacket {

	public PlayerLookPacket(float yaw, float pitch) throws IOException {
		super(0x0E);
		writeFloat(yaw);
		writeFloat(pitch);
		writeBoolean(true);
	}

}
