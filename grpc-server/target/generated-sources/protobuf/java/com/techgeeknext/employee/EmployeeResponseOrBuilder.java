// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee-service.proto

package com.techgeeknext.employee;

public interface EmployeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmployeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string emp_id = 1;</code>
   */
  java.lang.String getEmpId();
  /**
   * <code>string emp_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getEmpIdBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.constants.Role role = 3;</code>
   */
  int getRoleValue();
  /**
   * <code>.constants.Role role = 3;</code>
   */
  com.techgeeknext.constants.Role getRole();
}
