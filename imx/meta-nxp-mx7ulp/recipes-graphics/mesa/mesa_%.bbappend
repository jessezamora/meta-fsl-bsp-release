PACKAGECONFIG_remove_mx7ulp = "egl gles gbm"

PROVIDES_remove_mx7ulp = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl"

# FIXME: Dirty hack to allow use of Vivante GPU libGL binary
do_install_append_mx7ulp () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${libdir}/libGL.* \
              ${D}${includedir}/GL/gl.h \
              ${D}${includedir}/GL/glext.h \
              ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h
    fi
}
