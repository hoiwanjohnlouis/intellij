/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  98
 *  EncryptMethod
 *  int
 *  <p></p>
 *  Method of encryption.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None / Other
 *  <p>    1 - PKCS (Proprietary)
 *  <p>    2 - DES (ECB Mode)
 *  <p>    3 - PKCS / DES (Proprietary)
 *  <p>    4 - PGP / DES (Defunct)
 *  <p></p>
 *  <p>    5 - PGP / DES-MD5 (See app note on FIX website)
 *  <p>    6 - PEM / DES-MD5 (see app note on FIX website)
 */
public enum Enum98EncryptMethod implements LogFIXString, LogVerboseString {
    NONE_OR_OTHER("0", "NONE_OR_OTHER", "0 - None / Other"),
    PKCS("1", "PKCS", "1 - PKCS (Proprietary)"),
    DES_ECB("2", "DES_ECB", "2 - DES (ECB Mode)"),
    PKCS_DES("3", "PKCS_DES", "3 - PKCS / DES (Proprietary)"),
    PGP_DES("4", "PGP_DES", "4 - PGP / DES (Defunct)"),

    PGP_DES_MD5("5", "PGP_DES_MD5", "5 - PGP / DES-MD5 (See app note on FIX web site)"),
    PEM_DES_MD5("6", "PEM_DES_MD5", "6 - PEM / DES-MD5 (see app note on FIX web site)"),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum98EncryptMethod(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            System.out.println(oneEnum);
        }
    }
}
