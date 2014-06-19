{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf200
{\fonttbl\f0\fnil\fcharset0 Consolas-Bold;\f1\fnil\fcharset0 Consolas;\f2\fnil\fcharset0 Consolas-Italic;
}
{\colortbl;\red255\green255\blue255;\red38\green38\blue38;\red67\green67\blue67;\red135\green136\blue117;
\red210\green0\blue53;\red17\green137\blue135;\red53\green65\blue117;\red133\green0\blue2;\red14\green110\blue109;
}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl360

\f0\b\fs24 \cf2 import
\f1\b0  \cf3 groovy.json.JsonSlurper\cf2 \
\pard\pardeftab720\sl360

\f2\i \cf4 /**
\f1\i0 \cf2 \

\f2\i \cf4  *  Honeywell local API
\f1\i0 \cf2 \

\f2\i \cf4  *
\f1\i0 \cf2 \

\f2\i \cf4  *  Copyright 2014 Dattas Moonchaser
\f1\i0 \cf2 \

\f2\i \cf4  *
\f1\i0 \cf2 \

\f2\i \cf4  *  Permission is hereby granted, free of charge, to any person obtaining a copy
\f1\i0 \cf2 \

\f2\i \cf4  *  of this software and associated documentation files (the "Software"), to deal
\f1\i0 \cf2 \

\f2\i \cf4  *  in the Software without restriction, including without limitation the rights
\f1\i0 \cf2 \

\f2\i \cf4  *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
\f1\i0 \cf2 \

\f2\i \cf4  *  copies of the Software, and to permit persons to whom the Software is
\f1\i0 \cf2 \

\f2\i \cf4  *  furnished to do so, subject to the following conditions:
\f1\i0 \cf2 \

\f2\i \cf4  *  
\f1\i0 \cf2 \

\f2\i \cf4  *  The above copyright notice and this permission notice shall be included in
\f1\i0 \cf2 \

\f2\i \cf4  *  all copies or substantial portions of the Software.
\f1\i0 \cf2 \

\f2\i \cf4  *  
\f1\i0 \cf2 \

\f2\i \cf4  *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
\f1\i0 \cf2 \

\f2\i \cf4  *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
\f1\i0 \cf2 \

\f2\i \cf4  *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
\f1\i0 \cf2 \

\f2\i \cf4  *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
\f1\i0 \cf2 \

\f2\i \cf4  *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
\f1\i0 \cf2 \

\f2\i \cf4  *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
\f1\i0 \cf2 \

\f2\i \cf4  *  THE SOFTWARE.
\f1\i0 \cf2 \

\f2\i \cf4  *
\f1\i0 \cf2 \

\f2\i \cf4  */
\f1\i0 \cf2 \
metadata 
\f0\b \{
\f1\b0 \
	definition 
\f0\b (
\f1\b0 name: \cf5 "Honeywell local API"
\f0\b \cf2 ,
\f1\b0  namespace: \cf5 "Thermostat"
\f0\b \cf2 ,
\f1\b0  author: \cf5 "Dattas Moonchaser"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0\'a0\'a0	capability \cf5 "Temperature Measurement"\cf2 \
	capability \cf5 "Thermostat"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0capability \cf5 "Refresh"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0capability \cf5 "Sensor"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0capability \cf5 "Polling"\cf2 \
	
\f0\b \}
\f1\b0 \
\
	simulator 
\f0\b \{
\f1\b0 \
		
\f2\i \cf4 // TODO: define status and reply messages here
\f1\i0 \cf2 \
	
\f0\b \}
\f1\b0 \
\
	tiles 
\f0\b \{
\f1\b0 \
\'a0\'a0\'a0\'a0	valueTile
\f0\b (
\f1\b0 \cf5 "temperature"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.temperature"
\f0\b \cf2 ,
\f1\b0  width: \cf6 2
\f0\b \cf2 ,
\f1\b0  height: \cf6 2
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state
\f0\b (
\f1\b0 \cf5 "temperature"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{currentValue\}\'b0'
\f0\b \cf2 ,
\f1\b0  unit:\cf5 "F"
\f0\b \cf2 ,
\f1\b0 \
				backgroundColors:
\f0\b [
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 31
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#153591"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 44
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#1e9cbb"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 59
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#90d2a7"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 74
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#44b621"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 84
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#f1d801"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 95
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#d04e00"
\f0\b \cf2 ],
\f1\b0 \
					
\f0\b [
\f1\b0 value: \cf6 96
\f0\b \cf2 ,
\f1\b0  color: \cf5 "#bc2323"
\f0\b \cf2 ]
\f1\b0 \
				
\f0\b ]
\f1\b0 \
			
\f0\b )
\f1\b0 \
		
\f0\b \}
\f1\b0 \
		standardTile
\f0\b (
\f1\b0 \cf5 "mode"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.thermostatMode"
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false,
\f1\b0  decoration: \cf5 "flat"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "off"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatMode"\cf2 \
			state \cf5 "cool"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatMode"\cf2 \
			state \cf5 "heat"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatMode"\cf2 \
			state \cf5 "emergencyHeat"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatMode"\cf2 \
		
\f0\b \}
\f1\b0 \
		standardTile
\f0\b (
\f1\b0 \cf5 "fanMode"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.thermostatFanMode"
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false,
\f1\b0  decoration: \cf5 "flat"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "fanAuto"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatFanMode"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0state \cf5 "fanAuto/Circulate"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatFanMode"\cf2 \
			state \cf5 "fanOn"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{name\}'
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setThermostatFanMode"\cf2 \
		
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0	controlTile
\f0\b (
\f1\b0 \cf5 "heatSliderControl"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.heatingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "slider"
\f0\b \cf2 ,
\f1\b0  height: \cf6 1
\f0\b \cf2 ,
\f1\b0  width: \cf6 2
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false)
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "setHeatingSetpoint"
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setHeatingSetpoint"
\f0\b \cf2 ,
\f1\b0  backgroundColor:\cf5 "#d04e00"\cf2 \
		
\f0\b \}
\f1\b0 \
		valueTile
\f0\b (
\f1\b0 \cf5 "heatingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.heatingSetpoint"
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false,
\f1\b0  decoration: \cf5 "flat"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "heat"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{currentValue\}\'b0 heat'
\f0\b \cf2 ,
\f1\b0  unit:\cf5 "F"
\f0\b \cf2 ,
\f1\b0  backgroundColor:\cf5 "#ffffff"\cf2 \
		
\f0\b \}
\f1\b0 \
		controlTile
\f0\b (
\f1\b0 \cf5 "coolSliderControl"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.coolingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "slider"
\f0\b \cf2 ,
\f1\b0  height: \cf6 1
\f0\b \cf2 ,
\f1\b0  width: \cf6 2
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false)
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "setCoolingSetpoint"
\f0\b \cf2 ,
\f1\b0  action:\cf5 "thermostat.setCoolingSetpoint"
\f0\b \cf2 ,
\f1\b0  backgroundColor: \cf5 "#1e9cbb"\cf2 \
		
\f0\b \}
\f1\b0 \
		valueTile
\f0\b (
\f1\b0 \cf5 "coolingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.coolingSetpoint"
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false,
\f1\b0  decoration: \cf5 "flat"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "cool"
\f0\b \cf2 ,
\f1\b0  label:\cf5 '$\{currentValue\}\'b0 cool'
\f0\b \cf2 ,
\f1\b0  unit:\cf5 "F"
\f0\b \cf2 ,
\f1\b0  backgroundColor:\cf5 "#ffffff"\cf2 \
		
\f0\b \}
\f1\b0 \
		standardTile
\f0\b (
\f1\b0 \cf5 "refresh"
\f0\b \cf2 ,
\f1\b0  \cf5 "device.temperature"
\f0\b \cf2 ,
\f1\b0  inactiveLabel: 
\f0\b false,
\f1\b0  decoration: \cf5 "flat"
\f0\b \cf2 )
\f1\b0  
\f0\b \{
\f1\b0 \
			state \cf5 "default"
\f0\b \cf2 ,
\f1\b0  action:\cf5 "refresh.refresh"
\f0\b \cf2 ,
\f1\b0  icon:\cf5 "st.secondary.refresh"\cf2 \
		
\f0\b \}
\f1\b0 \
		main \cf5 "temperature"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0details
\f0\b ([
\f1\b0 \cf5 "temperature"
\f0\b \cf2 ,
\f1\b0  \cf5 "mode"
\f0\b \cf2 ,
\f1\b0  \cf5 "fanMode"
\f0\b \cf2 ,
\f1\b0  \cf5 "heatSliderControl"
\f0\b \cf2 ,
\f1\b0  \cf5 "heatingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "coolSliderControl"
\f0\b \cf2 ,
\f1\b0  \cf5 "coolingSetpoint"
\f0\b \cf2 ,
\f1\b0  \cf5 "refresh"
\f0\b \cf2 ])
\f1\b0 \
	
\f0\b \}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf2 \}
\f1\b0 \
\
\pard\pardeftab720\sl360

\f2\i \cf4 // parse events into attributes
\f1\i0 \cf2 \
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 parse\cf2 (
\f1\b0 String description
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
	log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "Parsing '$\{description\}'"\cf2 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  map 
\f0\b =
\f1\b0  
\f0\b [:]
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  retResult 
\f0\b =
\f1\b0  
\f0\b []
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  descMap 
\f0\b =
\f1\b0  parseDescriptionAsMap
\f0\b (
\f1\b0 description
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "parse returns $descMap"\cf2 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  body 
\f0\b =
\f1\b0  
\f0\b new
\f1\b0  String
\f0\b (
\f1\b0 descMap
\f0\b [
\f1\b0 \cf5 "body"
\f0\b \cf2 ].
\f1\b0 \cf9 decodeBase64
\f0\b \cf2 ())
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  slurper 
\f0\b =
\f1\b0  
\f0\b new
\f1\b0  JsonSlurper
\f0\b ()
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  result 
\f0\b =
\f1\b0  slurper
\f0\b .
\f1\b0 \cf9 parseText
\f0\b \cf2 (
\f1\b0 body
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "json is: $result"\cf2 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "success"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f2\i \cf4 //Do nothing as nothing can be done. (runIn doesn't appear to work here and apparently you can't make outbound calls here)
\f1\i0 \cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "returning now"\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b return
\f1\b0  
\f0\b null
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "tmode"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b \cf7 def
\f1\b0 \cf2  tmode 
\f0\b =
\f1\b0  getModeMap
\f0\b ()[
\f1\b0 result
\f0\b .
\f1\b0 \cf9 tmode
\f0\b \cf2 ]
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b if(
\f1\b0 device
\f0\b .
\f1\b0 \cf9 currentState
\f0\b \cf2 (
\f1\b0 \cf5 "thermostatMode"
\f0\b \cf2 )?.
\f1\b0 \cf9 value\cf2  
\f0\b !=
\f1\b0  tmode
\f0\b )\{
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0retResult 
\f0\b <<
\f1\b0  createEvent
\f0\b (
\f1\b0 name: \cf5 "thermostatMode"
\f0\b \cf2 ,
\f1\b0  value: tmode
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "fmode"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b \cf7 def
\f1\b0 \cf2  fmode 
\f0\b =
\f1\b0  getFanModeMap
\f0\b ()[
\f1\b0 result
\f0\b .
\f1\b0 \cf9 fmode
\f0\b \cf2 ]
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 device
\f0\b .
\f1\b0 \cf9 currentState
\f0\b \cf2 (
\f1\b0 \cf5 "thermostatFanMode"
\f0\b \cf2 )?.
\f1\b0 \cf9 value\cf2  
\f0\b !=
\f1\b0  fmode
\f0\b )\{
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0retResult 
\f0\b <<
\f1\b0  createEvent
\f0\b (
\f1\b0 name: \cf5 "thermostatFanMode"
\f0\b \cf2 ,
\f1\b0  value: fmode
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "t_cool"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b \cf7 def
\f1\b0 \cf2  t_cool 
\f0\b =
\f1\b0  getTemperature
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 t_cool
\f0\b \cf2 )
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 device
\f0\b .
\f1\b0 \cf9 currentState
\f0\b \cf2 (
\f1\b0 \cf5 "coolingSetpoint"
\f0\b \cf2 )?.
\f1\b0 \cf9 value\cf2  
\f0\b !=
\f1\b0  t_cool
\f0\b .
\f1\b0 \cf9 toString
\f0\b \cf2 ())\{
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0retResult 
\f0\b <<
\f1\b0  createEvent
\f0\b (
\f1\b0 name: \cf5 "coolingSetpoint"
\f0\b \cf2 ,
\f1\b0  value: t_cool
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "t_heat"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b \cf7 def
\f1\b0 \cf2  t_heat 
\f0\b =
\f1\b0  getTemperature
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 t_heat
\f0\b \cf2 )
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 device
\f0\b .
\f1\b0 \cf9 currentState
\f0\b \cf2 (
\f1\b0 \cf5 "heatingSetpoint"
\f0\b \cf2 )?.
\f1\b0 \cf9 value\cf2  
\f0\b !=
\f1\b0  t_heat
\f0\b .
\f1\b0 \cf9 toString
\f0\b \cf2 ())\{
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0retResult 
\f0\b <<
\f1\b0  createEvent
\f0\b (
\f1\b0 name: \cf5 "heatingSetpoint"
\f0\b \cf2 ,
\f1\b0  value: t_heat
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 containsKey
\f0\b \cf2 (
\f1\b0 \cf5 "temp"
\f0\b \cf2 ))\{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b \cf7 def
\f1\b0 \cf2  temp 
\f0\b =
\f1\b0  getTemperature
\f0\b (
\f1\b0 result
\f0\b .
\f1\b0 \cf9 temp
\f0\b \cf2 )
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 device
\f0\b .
\f1\b0 \cf9 currentState
\f0\b \cf2 (
\f1\b0 \cf5 "temperature"
\f0\b \cf2 )?.
\f1\b0 \cf9 value\cf2  
\f0\b !=
\f1\b0  temp
\f0\b .
\f1\b0 \cf9 toString
\f0\b \cf2 ())\{
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0retResult 
\f0\b <<
\f1\b0  createEvent
\f0\b (
\f1\b0 name: \cf5 "temperature"
\f0\b \cf2 ,
\f1\b0  value: temp
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0         \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\
\'a0\'a0\'a0\'a0log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "Parse returned $retResult"\cf2 \
\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 retResult
\f0\b .
\f1\b0 \cf9 size\cf2  
\f0\b >
\f1\b0  \cf6 0
\f0\b \cf2 )\{
\f1\b0 \
		
\f0\b return
\f1\b0  retResult\
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0  
\f0\b else
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0\'a0\'a0	
\f0\b return
\f1\b0  
\f0\b null
\f1\b0 \
\'a0\'a0\'a0\'a0
\f0\b \}
\f1\b0 \
\
\pard\pardeftab720\sl360

\f0\b \cf2 \}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 poll\cf2 ()
\f1\b0  
\f0\b \{
\f1\b0 \
	log
\f0\b .
\f1\b0 \cf9 debug\cf2  \cf5 "Executing 'poll'"\cf2 \
	sendEvent
\f0\b (
\f1\b0 descriptionText: \cf5 "poll keep alive"
\f0\b \cf2 ,
\f1\b0  isStateChange: 
\f0\b false)
\f1\b0   
\f2\i \cf4 // workaround to keep polling from being shut off
\f1\i0 \cf2 \
	refresh
\f0\b ()
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf2 \}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 modes\cf2 ()
\f1\b0  
\f0\b \{
\f1\b0 \
	
\f0\b [
\f1\b0 \cf5 "off"
\f0\b \cf2 ,
\f1\b0  \cf5 "heat"
\f0\b \cf2 ,
\f1\b0  \cf5 "cool"
\f0\b \cf2 ]
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf2 \}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 parseDescriptionAsMap\cf2 (
\f1\b0 description
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
	description
\f0\b .
\f1\b0 \cf9 split
\f0\b \cf2 (
\f1\b0 \cf5 ","
\f0\b \cf2 ).
\f1\b0 \cf9 inject
\f0\b \cf2 ([:])
\f1\b0  
\f0\b \{
\f1\b0  map
\f0\b ,
\f1\b0  param 
\f0\b ->
\f1\b0 \
		
\f0\b \cf7 def
\f1\b0 \cf2  nameAndValue 
\f0\b =
\f1\b0  param
\f0\b .
\f1\b0 \cf9 split
\f0\b \cf2 (
\f1\b0 \cf5 ":"
\f0\b \cf2 )
\f1\b0 \
		map 
\f0\b +=
\f1\b0  
\f0\b [(
\f1\b0 nameAndValue
\f0\b [
\f1\b0 \cf6 0
\f0\b \cf2 ].
\f1\b0 \cf9 trim
\f0\b \cf2 ()):
\f1\b0 nameAndValue
\f0\b [
\f1\b0 \cf6 1
\f0\b \cf2 ].
\f1\b0 \cf9 trim
\f0\b \cf2 ()]
\f1\b0 \
	
\f0\b \}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf2 \}
\f1\b0 \
\
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 getModeMap\cf2 ()
\f1\b0  
\f0\b \{
\f1\b0  
\f0\b [
\f1\b0 \
	\cf6 0
\f0\b \cf2 :
\f1\b0 \cf5 "off"
\f0\b \cf2 ,
\f1\b0 \
	\cf6 2
\f0\b \cf2 :
\f1\b0 \cf5 "cool"
\f0\b \cf2 ,
\f1\b0 \
	\cf6 1
\f0\b \cf2 :
\f1\b0 \cf5 "heat"
\f0\b \cf2 ,
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf2 ]\}
\f1\b0 \
\
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 getFanModeMap\cf2 ()
\f1\b0  
\f0\b \{
\f1\b0  
\f0\b [
\f1\b0 \
	\cf6 0
\f0\b \cf2 :
\f1\b0 \cf5 "fanAuto"
\f0\b \cf2 ,
\f1\b0 \
	\cf6 1
\f0\b \cf2 :
\f1\b0 \cf5 "fanAuto/Circulate"
\f0\b \cf2 ,
\f1\b0 \
\'a0\'a0\'a0\'a0\cf6 2
\f0\b \cf2 :
\f1\b0 \cf5 "fanOn"\cf2 \
\pard\pardeftab720\sl360

\f0\b \cf2 ]\}
\f1\b0 \
\pard\pardeftab720\sl360

\f0\b \cf7 def
\f1\b0 \cf2  
\f0\b \cf8 getTemperature\cf2 (
\f1\b0 value
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
	
\f0\b if(
\f1\b0 getTemperatureScale
\f0\b ()
\f1\b0  
\f0\b ==
\f1\b0  \cf5 "C"
\f0\b \cf2 )\{
\f1\b0 \
		
\f0\b return
\f1\b0  
\f0\b (((
\f1\b0 value
\f0\b -
\f1\b0 \cf6 32
\f0\b \cf2 )*
\f1\b0 \cf6 5.0
\f0\b \cf2 )
\f1\b0 \cf5 /9.0)\cf2 \
\pard\pardeftab720\sl360
\cf5 	\} else \{\cf2 \
\cf5 		return value\cf2 \
\cf5 	\}\cf2 \
\cf5 \}\cf2 \
\
\cf5 // handle commands\cf2 \
\cf5 def setHeatingSetpoint(degrees) \{\cf2 \
\cf5 	def degreesInteger = degrees as Integer\cf2 \
\cf5 	log.debug "Executing 'setHeatingSetpoint' with $\{degreesInteger\}"\cf2 \
\cf5     postapi("\{\\"it_heat\\":$\{degreesInteger\}\}")\cf2 \
\cf5 \}\cf2 \
\
\cf5 def setCoolingSetpoint(degrees) \{\cf2 \
\cf5 	def degreesInteger = degrees as Integer\cf2 \
\cf5 	log.debug "Executing 'setCoolingSetpoint' with $\{degreesInteger\}"\cf2 \
\cf5     postapi("\{\\"it_cool\\":$\{degreesInteger\}\}")\cf2 \
\cf5 \}\cf2 \
\
\cf5 def off() \{\cf2 \
\cf5 	log.debug "Executing 'off'"\cf2 \
\cf5     postapi('\{"tmode":0\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def heat() \{\cf2 \
\cf5 	log.debug "Executing 'heat'"\cf2 \
\cf5 	postapi('\{"tmode":1\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def emergencyHeat() \{\cf2 \
\cf5 	log.debug "Executing 'emergencyHeat'"\cf2 \
\cf5 	// TODO: handle 'emergencyHeat' command\cf2 \
\cf5 \}\cf2 \
\
\cf5 def cool() \{\cf2 \
\cf5 	log.debug "Executing 'cool'"\cf2 \
\cf5 	postapi('\{"tmode":2\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def setThermostatMode() \{\cf2 \
\cf5 	log.debug "switching thermostatMode"\cf2 \
\cf5 	def currentMode = device.currentState("thermostatMode")?.value\cf2 \
\cf5 	def modeOrder = modes()\cf2 \
\cf5 	def index = modeOrder.indexOf(currentMode)\cf2 \
\cf5 	def next = index >= 0 && index < modeOrder.size() - 1 ? modeOrder[index + 1] : modeOrder[0]\cf2 \
\cf5 	log.debug "switching mode from $currentMode to $next"\cf2 \
\cf5 	"$next"()\cf2 \
\cf5 \}\cf2 \
\
\cf5 def fanOn() \{\cf2 \
\cf5 	log.debug "Executing 'fanOn'"\cf2 \
\cf5 	postapi('\{"fmode":2\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def fanAuto() \{\cf2 \
\cf5 	log.debug "Executing 'fanAuto'"\cf2 \
\cf5 	postapi('\{"fmode":0\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def fanCirculate() \{\cf2 \
\cf5 	log.debug "Executing 'fanCirculate'"\cf2 \
\cf5 	postapi('\{"fmode":1\}')\cf2 \
\cf5 \}\cf2 \
\
\cf5 def setThermostatFanMode() \{\cf2 \
\cf5 	log.debug "Switching fan mode"\cf2 \
\cf5 	def currentFanMode = device.currentState("thermostatFanMode")?.value\cf2 \
\cf5 	log.debug "switching fan from current mode: $currentFanMode"\cf2 \
\cf5 	def returnCommand\cf2 \
\
\cf5 	switch (currentFanMode) \{\cf2 \
\cf5 		case "fanAuto":\cf2 \
\cf5 			returnCommand = fanCirculate()\cf2 \
\cf5 			break\cf2 \
\cf5         case "fanAuto/\cf2 Circulate\cf5 ":\cf2 \
\cf5         	returnCommand = fanOn()\cf2 \
\cf5             break;\cf2 \
\cf5 		case "\cf2 fanOn\cf5 ":\cf2 \
\cf5 			returnCommand = fanAuto()\cf2 \
\cf5 			break\cf2 \
\cf5 	\}\cf2 \
\cf5 	if(!currentFanMode) \{ returnCommand = fanAuto() \}\cf2 \
\cf5 	returnCommand\cf2 \
\cf5 \}\cf2 \
\
\cf5 def auto() \{\cf2 \
\cf5 	log.debug "\cf2 Executing \cf5 'auto'"\cf2 \
\cf5 	postapi('\{"\cf2 tmode\cf5 ":3\}')\cf2 \
\cf5 \}\cf2 \
\cf5 def refresh() \{\cf2 \
\cf5 	log.debug "\cf2 Executing \cf5 'refresh'"\cf2 \
\cf5 	getapi()\cf2 \
\cf5 \}\cf2 \
\
\cf5 private getapi() \{\cf2 \
\cf5   log.debug("\cf2 Executing get api\cf5 ")\cf2 \
\
\cf5   def uri = "/tstat"\cf2 \
\
\cf5   def hubAction = new physicalgraph.device.HubAction(\cf2 \
\cf5     method: "GET",\cf2 \
\cf5     path: uri,\cf2 \
\cf5     headers: [HOST:getHostAddress()]\cf2 \
\cf5   )\cf2 \
\
\cf5   hubAction\cf2 \
\cf5 \}\cf2 \
\cf5 private postapi(command) \{\cf2 \
\cf5   log.debug("Executing $\{command\}")\cf2 \
\
\cf5   def uri = "/\cf2 tstat\cf5 "\cf2 \
\
\cf5   def hubAction = [new physicalgraph.device.HubAction(\cf2 \
\cf5     method: "\cf2 POST\cf5 ",\cf2 \
\cf5     path: uri,\cf2 \
\cf5     body: command,\cf2 \
\cf5     headers: [Host:getHostAddress(), "\cf2 Content
\f0\b -
\f1\b0 Type\cf5 ":"\cf2 application\cf5 /x-www-form-urlencoded" ]\cf2 \
\cf5   ), delayAction(1000), refresh()]\cf2 \
\
\cf5   hubAction\cf2 \
\cf5 \}\cf2 \
\
\cf5 /
\f0\b \cf2 /
\f1\b0 helper methods\
\pard\pardeftab720\sl360

\f0\b \cf2 private
\f1\b0  
\f0\b \cf8 delayAction\cf2 (\cf7 long
\f1\b0 \cf2  time
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
	
\f0\b new
\f1\b0  physicalgraph
\f0\b .
\f1\b0 \cf9 device
\f0\b \cf2 .
\f1\b0 \cf9 HubAction
\f0\b \cf2 (
\f1\b0 \cf5 "delay $time"
\f0\b \cf2 )
\f1\b0 \

\f0\b \}
\f1\b0 \

\f0\b private
\f1\b0  Integer 
\f0\b \cf8 convertHexToInt\cf2 (
\f1\b0 hex
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0Integer
\f0\b .
\f1\b0 \cf9 parseInt
\f0\b \cf2 (
\f1\b0 hex
\f0\b ,
\f1\b0 \cf6 16
\f0\b \cf2 )
\f1\b0 \

\f0\b \}
\f1\b0 \
\

\f0\b private
\f1\b0  String 
\f0\b \cf8 convertHexToIP\cf2 (
\f1\b0 hex
\f0\b )
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0
\f0\b [
\f1\b0 convertHexToInt
\f0\b (
\f1\b0 hex
\f0\b [
\f1\b0 \cf6 0
\f0\b \cf2 ..
\f1\b0 \cf6 1
\f0\b \cf2 ]),
\f1\b0 convertHexToInt
\f0\b (
\f1\b0 hex
\f0\b [
\f1\b0 \cf6 2
\f0\b \cf2 ..
\f1\b0 \cf6 3
\f0\b \cf2 ]),
\f1\b0 convertHexToInt
\f0\b (
\f1\b0 hex
\f0\b [
\f1\b0 \cf6 4
\f0\b \cf2 ..
\f1\b0 \cf6 5
\f0\b \cf2 ]),
\f1\b0 convertHexToInt
\f0\b (
\f1\b0 hex
\f0\b [
\f1\b0 \cf6 6
\f0\b \cf2 ..
\f1\b0 \cf6 7
\f0\b \cf2 ])].
\f1\b0 \cf9 join
\f0\b \cf2 (
\f1\b0 \cf5 "."
\f0\b \cf2 )
\f1\b0 \

\f0\b \}
\f1\b0 \
\

\f0\b private
\f1\b0  
\f0\b \cf8 getHostAddress\cf2 ()
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  parts 
\f0\b =
\f1\b0  device
\f0\b .
\f1\b0 \cf9 deviceNetworkId
\f0\b \cf2 .
\f1\b0 \cf9 split
\f0\b \cf2 (
\f1\b0 \cf5 ":"
\f0\b \cf2 )
\f1\b0 \
\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  ip 
\f0\b =
\f1\b0  convertHexToIP
\f0\b (
\f1\b0 parts
\f0\b [
\f1\b0 \cf6 0
\f0\b \cf2 ])
\f1\b0 \
\'a0\'a0
\f0\b \cf7 def
\f1\b0 \cf2  port 
\f0\b =
\f1\b0  convertHexToInt
\f0\b (
\f1\b0 parts
\f0\b [
\f1\b0 \cf6 1
\f0\b \cf2 ])
\f1\b0 \
\'a0\'a0
\f0\b return
\f1\b0  ip 
\f0\b +
\f1\b0  \cf5 ":"\cf2  
\f0\b +
\f1\b0  port\

\f0\b \}
\f1\b0 \
}