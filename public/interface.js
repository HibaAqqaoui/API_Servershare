import { interval } from 'rxjs';
import { switchMap, takeUntil } from 'rxjs/operators';
import { fromFetch } from 'rxjs/fetch';

const button = document.getElementById('toggleButton');
const textInput = document.getElementById('textInput');

let subscription;

button.addEventListener('click', () => {
    if (button.innerHTML === 'Start') {
        button.innerHTML = 'Stop';
        textInput.disabled = true;

        const n = parseInt(textInput.value, 10) * 1000;

        subscription = interval(n)
            .pipe(
                switchMap(() => fromFetch('/path/to/shared/folder')),
                switchMap(response => response.text()),
                takeUntil(fromEvent(button, 'click'))
            )
            .subscribe(content => {
                document.getElementById('contentDisplay').innerHTML = content;
            }, error => {
                console.error('Error:', error);
            });
    } else {
        button.innerHTML = 'Start';
        textInput.disabled = false;

        if (subscription) {
            subscription.unsubscribe();
        }
    }
});