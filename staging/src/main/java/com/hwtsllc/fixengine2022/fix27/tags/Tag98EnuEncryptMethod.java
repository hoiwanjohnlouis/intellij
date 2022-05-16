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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum98EncryptMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  98
 *  EncryptMethod
 *  int
 *  Method of encryption.
 *  Valid values:
 *      0 - None / Other
 *      1 - PKCS (Proprietary)
 *      2 - DES (ECB Mode)
 *      3 - PKCS / DES (Proprietary)
 *      4 - PGP / DES (Defunct)
 *
 *      5 - PGP / DES-MD5 (See app note on FIX web site)
 *      6 - PEM / DES-MD5 (see app note on FIX web site)
 */
public class Tag98EnuEncryptMethod extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum98EncryptMethod dataValue;

    public final static Enum98EncryptMethod TESTA_ENU_ENCRYPT_METHOD
            = Enum98EncryptMethod.NONE_OR_OTHER;
    public final static Enum98EncryptMethod TESTB_ENU_ENCRYPT_METHOD
            = Enum98EncryptMethod.PEM_DES_MD5;

    public Tag98EnuEncryptMethod(Enum98EncryptMethod dataValue) {
        setFixType(FIX27.FIX98_ENU_ENCRYPT_METHOD);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        dumpDataValues(new Tag98EnuEncryptMethod(TESTA_ENU_ENCRYPT_METHOD));
        dumpDataValues(new Tag98EnuEncryptMethod(TESTB_ENU_ENCRYPT_METHOD));
    }
    static void dumpDataValues(Tag98EnuEncryptMethod tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}