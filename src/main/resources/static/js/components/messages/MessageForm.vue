<template>
    <v-layout row>
        <v-text-field
                label = "New message"
                v-model="text"
        />
        <v-btn @click="save" large color="primary">
            Save
        </v-btn>
    </v-layout>
</template>

<script>
    import {mapActions} from 'vuex'

    export default {
        props: ['messageAttr'],
        data() {
            return {
                text: '',
                id: ''
            }
        },
        watch: {
            messageAttr(newVal, oldVal) {
                this.text = newVal.text;
                this.id = newVal.id;
            }
        },
        methods: {
            ...mapActions(['addMessageAction', 'updateMessageAction']),
            save() {
                const message = {
                    id: this.id,
                    text: this.text
                }

                if (this.id) {
                    this.updateMessageAction(message)
                } else {
                    this.addMessageAction(message)
                }
                this.text = ''
                this.id = ''
            }
        }
    }
</script>

<style>

</style>