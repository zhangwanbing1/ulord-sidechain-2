/*
 * This file is part of USC
 * Copyright (C) 2016 - 2018 USC developer team.
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

package co.usc.rpc.modules.personal;

import co.usc.config.UscSystemProperties;
import org.ethereum.rpc.exception.DisabledWalletException;
import org.ethereum.rpc.Web3;

public class PersonalModuleWalletDisabled implements PersonalModule {
    @Override
    public void init(UscSystemProperties properties) {
        // Init steps are only needed when using a wallet.
        // This method is called from Web3Impl even if the wallet is disabled,
        // so we don't throw here.
    }

    @Override
    public String newAccountWithSeed(String seed) {
        throw new DisabledWalletException();
    }

    @Override
    public String newAccount(String passphrase) {
        throw new DisabledWalletException();
    }

    @Override
    public String[] listAccounts() {
        throw new DisabledWalletException();
    }

    @Override
    public String importRawKey(String key, String passphrase) {
        throw new DisabledWalletException();
    }

    @Override
    public String sendTransaction(Web3.CallArguments args, String passphrase) {
        throw new DisabledWalletException();
    }

    @Override
    public boolean unlockAccount(String address, String passphrase, String duration) {
        throw new DisabledWalletException();
    }

    @Override
    public boolean lockAccount(String address) {
        throw new DisabledWalletException();
    }

    @Override
    public String dumpRawKey(String address) {
        throw new DisabledWalletException();
    }
}