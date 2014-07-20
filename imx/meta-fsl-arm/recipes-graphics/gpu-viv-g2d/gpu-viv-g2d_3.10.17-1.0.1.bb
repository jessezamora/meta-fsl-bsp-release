# Copyright (C) 2013-14 Freescale Semiconductor

require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc

LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=861ebad4adc7236f8d1905338abd7eb2"

SRC_URI[md5sum] = "f796ee179464339fbbb06c13ba84cea7"
SRC_URI[sha256sum] = "cc64117a7f6663386758a92101a73e9605d030a5ed61a9dbb2b96f3c61302f89"

FILES_${PN} += " ${bindir}/gmem_info "
FILES_${PN}-dbg += "$ {bindir}/.debug/gmem_info"
FILES_${PN} += " ${libdir}/libg2d-viv${SOLIBS} "
