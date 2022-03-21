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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix30.enums.Enum104IOIQualifier;

public class Tag104IOIQualifier extends TagTypeAbstract {
    private final Enum104IOIQualifier dataValue;

    public final static Enum104IOIQualifier TESTA_IOI_QUALIFIER = Enum104IOIQualifier.ALL_OR_NONE; // fake data
    public final static Enum104IOIQualifier TESTB_IOI_QUALIFIER = Enum104IOIQualifier.PRE_OPEN;

    public Tag104IOIQualifier(Enum104IOIQualifier dataValue) {
        setFixType(FIXType.FIX104_IOI_QUALIFIER);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag104IOIQualifier tagData = new Tag104IOIQualifier(TESTA_IOI_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
