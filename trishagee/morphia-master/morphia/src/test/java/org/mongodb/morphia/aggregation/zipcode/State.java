/*
 * Copyright (c) 2008-2016 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.morphia.aggregation.zipcode;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity
public class State {
    @Id
    private ObjectId id;
    @Property("state")
    private String state;
    @Embedded("biggestCity")
    private CityPopulation biggest;
    @Embedded("smallestCity")
    private CityPopulation smallest;

    public CityPopulation getBiggest() {
        return biggest;
    }

    public CityPopulation getSmallest() {
        return smallest;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("State{state='%s', biggest=%s, smallest=%s}", state, biggest, smallest);
    }
}
