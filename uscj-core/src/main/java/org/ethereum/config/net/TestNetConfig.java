/*
 * This file is part of USC
 * Copyright (C) 2016 - 2018 USC developer team.
 * (derived from ethereumJ library, Copyright (c) 2016 <ether.camp>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.ethereum.config.net;


import org.ethereum.config.blockchain.testnet.TestNetAfterBridgeSyncConfig;
import org.ethereum.config.blockchain.testnet.TestNetBeforeBridgeSyncConfig;
import org.ethereum.config.blockchain.testnet.TestNetShakespeareConfig;
import org.ethereum.config.blockchain.testnet.TestNetUnlimitedWhitelistConfig;

public class TestNetConfig extends AbstractNetConfig {
    public static final TestNetConfig INSTANCE = new TestNetConfig();

    public TestNetConfig() {
        add(0, new TestNetBeforeBridgeSyncConfig());
        // 21 days of 1 block every 14 seconds.
        // On blockchain launch blocks will be faster until difficulty is adjusted to available hashing power.
        add(129_600, new TestNetAfterBridgeSyncConfig());
        add(399_093, new TestNetUnlimitedWhitelistConfig());
        add(462_000, new TestNetShakespeareConfig());
    }
}
