/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCharIndexTripletData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCharIndexTripletData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCharIndexTripletData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCharIndexTripletData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_values(short[] value) {
    gdxBulletJNI.btCharIndexTripletData_m_values_set(swigCPtr, this, value);
  }

  public short[] getM_values() {
    return gdxBulletJNI.btCharIndexTripletData_m_values_get(swigCPtr, this);
  }

  public void setM_pad(char value) {
    gdxBulletJNI.btCharIndexTripletData_m_pad_set(swigCPtr, this, value);
  }

  public char getM_pad() {
    return gdxBulletJNI.btCharIndexTripletData_m_pad_get(swigCPtr, this);
  }

  public btCharIndexTripletData() {
    this(gdxBulletJNI.new_btCharIndexTripletData(), true);
  }

}
