<template>
    <div>
        <div v-if="!profile">Please Authorize through
            <a href="/login">Google</a>
        </div>
        <div v-else>
            <div>{{profile.name}}&nbsp;<a href="/logout">Logout</a></div>
            <messages-list :messages="messages" />
        </div>
    </div>
</template>

<script>

</script>

<style>

</style>