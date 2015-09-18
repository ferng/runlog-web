<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row">
    <div class="input-group input-group-sm">
        <span class="input-group-addon" id="lap-distance">D</span>
        <input type="text" class="form-control" placeholder="Distance" aria-describedby="lap-distance" value="${param.distance}">
        <span class="input-group-addon" id="lap-dist-units">U</span>
        <input type="text" class="form-control" placeholder="Dist Units" aria-describedby="lap-dist-units" value="${param.distUnit}">
        <span class="input-group-addon" id="lap-time">T</span>
        <input type="text" class="form-control" placeholder="Time" aria-describedby="lap-time" value="${param.time}">
    </div>
</div>
