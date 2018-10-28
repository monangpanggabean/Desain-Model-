cmake_minimum_required(VERSION 3.0)
project(model)

set(CMAKE_CXX_STANDARD 11)
include_directories(${CMAKE_SOURCE_DIR})


set(SOURCE_FILES
model_Model.h
model_Main.cpp
SysCallReader.h
SysCallReader.cpp
UsingSystem.h
UsingSystem.cpp
UsingIO.h
UsingIO.cpp
AnyActions.h
AnyActions.cpp
AllRunModules.h
AllRunModules.cpp
AllRunExecutions.h
AllRunExecutions.cpp
Registers.h
Registers.cpp
Function.h
Function.cpp
Parameters.h
Parameters.cpp
Clusterizing.h
Clusterizing.cpp
Classifications.h
Classifications.cpp
Localizer.h
Localizer.cpp
AllProcesstoBuffers.h
AllProcesstoBuffers.cpp
MemoryAccess.h
MemoryAccess.cpp
HardWareAccess.h
HardWareAccess.cpp
ExecutedProcess.h
ExecutedProcess.cpp
InterfaceforAgentExecManager.h
InterfaceforAgentExecManager.cpp
End.h
End.cpp)

add_executable(model ${SOURCE_FILES})