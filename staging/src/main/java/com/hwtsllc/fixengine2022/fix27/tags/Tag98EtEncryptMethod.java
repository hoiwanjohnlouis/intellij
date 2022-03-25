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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum98EncryptMethod;

public class Tag98EtEncryptMethod extends TagTypeAbstract {
    private final Enum98EncryptMethod dataValue;

    public final static Enum98EncryptMethod TESTA_ET_ENCRYPT_METHOD = Enum98EncryptMethod.NONE_OR_OTHER;
    public final static Enum98EncryptMethod TESTB_ET_ENCRYPT_METHOD = Enum98EncryptMethod.PEM_DES_MD5;

    public Tag98EtEncryptMethod(Enum98EncryptMethod dataValue) {
        setFixType(FIXType.FIX98_ET_ENCRYPT_METHOD);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag98EtEncryptMethod tagData = new Tag98EtEncryptMethod(TESTA_ET_ENCRYPT_METHOD);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}