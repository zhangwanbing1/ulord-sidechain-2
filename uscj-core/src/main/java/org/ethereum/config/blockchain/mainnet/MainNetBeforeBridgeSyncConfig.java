package org.ethereum.config.blockchain.mainnet;

import org.ethereum.config.Constants;
import org.ethereum.config.blockchain.mainnet.MainNetAfterBridgeSyncConfig;
import org.ethereum.core.BlockHeader;

public class MainNetBeforeBridgeSyncConfig extends MainNetAfterBridgeSyncConfig {

    public MainNetBeforeBridgeSyncConfig() {
        super(new MainNetAfterBridgeSyncConfig.MainNetConstants());
    }

    protected MainNetBeforeBridgeSyncConfig(Constants constants) {
        super(constants);
    }

    @Override
    public boolean areBridgeTxsFree() {
        return true;
    }

    @Override
    public boolean isUscIP87() { return false; }

    @Override
    public boolean isUscIP85() {
        return false;
    }

    @Override
    public boolean isUscIP88() { return false; }

    @Override
    public boolean isUscIP89() {
        return false;
    }

    @Override
    public boolean isUscIP90() {
        return false;
    }

    @Override
    public boolean isUscIP91() {
        return false;
    }

    @Override
    public boolean isUscIP92() {
        return false;
    }

    @Override
    public boolean isUscIP93() {
        return false;
    }

    @Override
    public boolean isUscIP94() {
        return false;
    }

    @Override
    public boolean isUscIP98() {
        return false;
    }
}
