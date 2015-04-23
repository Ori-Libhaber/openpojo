/*
 * Copyright (c) 2010-2015 Osman Shoukry
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, either version 3 of the License or any
 *    later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.openpojo.random.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

import com.openpojo.random.map.util.BaseMapRandomGenerator;
import com.openpojo.random.map.util.MapHelper;
import com.openpojo.random.util.Helper;
import com.openpojo.random.util.SerializableComparableObject;

/**
 * @author oshoukry
 */
public class IdentityHashMapRandomGenerator extends BaseMapRandomGenerator {
    private static final Class<?>[] TYPES = new Class<?>[] { IdentityHashMap.class };
    private static final IdentityHashMapRandomGenerator INSTANCE = new IdentityHashMapRandomGenerator();

    public static IdentityHashMapRandomGenerator getInstance() {
        return INSTANCE;
    }

    public Collection<Class<?>> getTypes() {
        return Arrays.asList(TYPES);
    }

    @Override
    protected Map getBasicInstance(Class<?> type) {
        Helper.assertIsAssignableTo(type, getTypes());
        return MapHelper.buildMap(new IdentityHashMap(), SerializableComparableObject.class, SerializableComparableObject.class);
    }

    private IdentityHashMapRandomGenerator() {
    }

}
